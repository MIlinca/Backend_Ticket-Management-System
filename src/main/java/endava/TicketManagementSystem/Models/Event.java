package endava.TicketManagementSystem.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventID")
    private Long eventID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "StartDate")
    private Date startDate;

    @Column(name = "EndDate")
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "VenueID")
    private Venue venueID;

    @OneToMany(mappedBy = "eventID", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonIgnoreProperties("event")
    private List<TicketCategory> listTicketCategory = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "EventTypeID")
    private EventType eventTypeID;

    @Override
    public String toString() {
        return "Event{" +
                "id=" + eventID +
                ", venue=" + venueID +
                ", eventType=" + eventTypeID +
                ", description='" + description + '\'' +
                ", name=" + name + '\'' +
                ", startDate=" + startDate + '\'' +
                ", endDate=" + endDate + '\'' +
                ", ticketCategories=" + listTicketCategory +
                '}';
    }
}
