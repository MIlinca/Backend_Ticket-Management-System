package endava.TicketManagementSystem.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private Long customerID= Long.valueOf(2);
    private Long eventID;
    private Long ticketCategoryID;
    private Long orderTickets;
}
