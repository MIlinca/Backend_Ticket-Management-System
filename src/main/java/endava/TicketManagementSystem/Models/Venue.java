package endava.TicketManagementSystem.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name="Venue")
public class Venue{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="VenueID")
    private Long venueID;

    @Column(name="Location")
    private String venueLocation;

    @Column(name="Type")
    private String venueType;

    @Column(name="Capacity")
    private Long venueCapacity;
    @Override
    public String toString() {
        return "{id=" + venueID +
                ", name='" + venueType + '\'' +
                ", location='" + venueLocation + '\'' +
                ", capacity=" + venueCapacity +
                '}';
    }
}
