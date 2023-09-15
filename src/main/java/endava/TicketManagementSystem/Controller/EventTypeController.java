package endava.TicketManagementSystem.Controller;

import endava.TicketManagementSystem.Models.EventType;
import endava.TicketManagementSystem.Service.EventTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventTypeController {
    private final EventTypeService eventTypeService;

    public EventTypeController(EventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
    }


    @GetMapping("/eventtype")
    public EventType findByEventTypeID(String eventTypeName){
        eventTypeName="Sport";
        return eventTypeService.findByEventTypeName(eventTypeName);
    }
}
