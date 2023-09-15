package endava.TicketManagementSystem.Repository;


import endava.TicketManagementSystem.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
List<Orders> findAllByCustomerID_CustomerID(Long customerID);
}
