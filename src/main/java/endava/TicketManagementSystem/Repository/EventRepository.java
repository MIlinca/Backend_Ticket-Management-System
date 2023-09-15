package endava.TicketManagementSystem.Repository;


import endava.TicketManagementSystem.Models.Event;
import endava.TicketManagementSystem.Models.EventType;
import endava.TicketManagementSystem.Models.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
       List<Event> findAllByVenueID_VenueIDAndEventTypeID_EventTypeID(Long venueID, Long eventType);
}
