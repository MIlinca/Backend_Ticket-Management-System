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
@Table(name="EventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EventTypeID")
    private Long eventTypeID;

    @Column(name="EventTypeName")
    private String eventTypeName;
    @Override
    public String toString() {
        return eventTypeName;
    }


}
