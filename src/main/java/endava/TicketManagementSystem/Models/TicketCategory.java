package endava.TicketManagementSystem.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TicketCategory")
public class TicketCategory  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="TicketCategoryID;")
    private Long ticketCategoryID;

    @Column(name="Description")
    private String description;

    @Column(name="Price")
    private Long price;

    @ManyToOne
    @JoinColumn(name="EventID")
    private Event eventID;

    @Override
    public String toString() {
        return "{id=" + ticketCategoryID +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
