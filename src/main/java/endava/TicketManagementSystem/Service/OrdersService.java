package endava.TicketManagementSystem.Service;

import endava.TicketManagementSystem.Dto.OrderDto;
import endava.TicketManagementSystem.Models.Customer;
import endava.TicketManagementSystem.Models.Orders;
import endava.TicketManagementSystem.Models.TicketCategory;
import endava.TicketManagementSystem.Repository.CustomerRepository;
import endava.TicketManagementSystem.Repository.OrdersRepository;
import endava.TicketManagementSystem.Repository.TicketCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class OrdersService {

private final OrdersRepository ordersRepository;
private final CustomerRepository customerRepository;
private final TicketCategoryRepository ticketCategoryRepository;

    public OrdersService(OrdersRepository ordersRepository, CustomerRepository customerRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.ordersRepository = ordersRepository;
        this.customerRepository = customerRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    public List<Orders> getOrdersByCustomerID(){
        Long customerID= Long.valueOf(1);
        return ordersRepository.findAllByCustomerID_CustomerID(customerID);
    }
    public String createOrder(OrderDto orderDto) throws Exception {
        Orders order=new Orders();
        Long customerID = orderDto.getCustomerID();
        Customer customer= customerRepository.findById(customerID).orElse(null);
        if(customer==null)
            throw new Exception("The customer does not exist!");

        order.setCustomerID(customer);
        order.setOrderDate(Calendar.getInstance().getTime());
        order.setOrderTickets(orderDto.getOrderTickets());

        TicketCategory ticketCategory= ticketCategoryRepository.findById(orderDto.getTicketCategoryID()).orElse(null);
        if(ticketCategory==null)
            throw new Exception("This type of ticket does not exist!");
        order.setTicketCategoryID(ticketCategory);


        long totalPrice = ticketCategory.getPrice()*orderDto.getOrderTickets();
        order.setOrderTotalPrice(totalPrice);

        ordersRepository.save(order);
        return "Order placed successfully!";
    }
}
