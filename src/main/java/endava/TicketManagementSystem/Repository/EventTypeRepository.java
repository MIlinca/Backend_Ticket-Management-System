package endava.TicketManagementSystem.Repository;

import endava.TicketManagementSystem.Models.Event;
import endava.TicketManagementSystem.Models.EventType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeRepository  extends JpaRepository<EventType, Long> {
    EventType findByEventTypeName(String eventTypeName);
}
