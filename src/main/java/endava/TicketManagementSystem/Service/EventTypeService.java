package endava.TicketManagementSystem.Service;



import endava.TicketManagementSystem.Models.EventType;
import endava.TicketManagementSystem.Repository.EventTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class EventTypeService {
private  final EventTypeRepository eventTypeRepository;

    public EventTypeService(EventTypeRepository eventTypeRepository) {
        this.eventTypeRepository = eventTypeRepository;
    }


    public EventType findByEventTypeName(String eventTypeName){
        return eventTypeRepository.findByEventTypeName(eventTypeName);
    }
}


