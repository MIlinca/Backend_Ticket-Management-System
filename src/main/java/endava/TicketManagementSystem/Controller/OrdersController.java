package endava.TicketManagementSystem.Controller;


import endava.TicketManagementSystem.Dto.OrderDto;
import endava.TicketManagementSystem.Models.Orders;
import endava.TicketManagementSystem.Service.OrdersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {
private final OrdersService ordersService;

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping("/orders")
    public ResponseEntity<?> getOrdersByCustomerID(){
        List<Orders> orders=ordersService.getOrdersByCustomerID();
        return ResponseEntity.ok(orders.toString());
    }
    @PostMapping("/saveOrders")
    public ResponseEntity<?> createOrders(@RequestBody OrderDto orderDto){
        try {
            String result = ordersService.createOrder(orderDto);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
