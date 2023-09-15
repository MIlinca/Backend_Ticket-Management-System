package endava.TicketManagementSystem.Service;



import endava.TicketManagementSystem.Models.Event;
import endava.TicketManagementSystem.Models.EventType;

import endava.TicketManagementSystem.Repository.EventRepository;
import endava.TicketManagementSystem.Repository.EventTypeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

private final  EventTypeRepository eventTypeRepository;

    public EventService(EventRepository eventRepository, EventTypeRepository eventTypeRepository) {
        this.eventRepository = eventRepository;
        this.eventTypeRepository = eventTypeRepository;
    }

    public List<Event> getEventsByVenueIdAndEventType(Long venueID,String eventType) {


        EventType eventTypeObj = eventTypeRepository.findByEventTypeName(eventType);

        return eventRepository.findAllByVenueID_VenueIDAndEventTypeID_EventTypeID(venueID, eventTypeObj.getEventTypeID());
    }
}

