package endava.TicketManagementSystem.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="OrderID")
    private Long orderID;

    @Column(name="OrderedAt")
    private Date orderDate;

    @Column(name="NumberOfTickets")
    private Long orderTickets;

    @Column(name="TotalPrice")
    private Long orderTotalPrice;

    @ManyToOne
    @JoinColumn(name="CustomerID")
    private Customer customerID;

    @ManyToOne
    @JoinColumn(name="TicketCategoryID")
    private TicketCategory ticketCategoryID;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + orderID +
                ", orderDate=" + orderDate +
                ", ticketCategoryID=" + ticketCategoryID.getTicketCategoryID()+
                ", numberOfTickets='" + orderTickets + '\'' +
                ", totalPrice=" + orderTotalPrice + '\'' +
                '}';
    }

}
