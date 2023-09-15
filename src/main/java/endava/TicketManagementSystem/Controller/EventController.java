package endava.TicketManagementSystem.Controller;

import endava.TicketManagementSystem.Models.Event;

import endava.TicketManagementSystem.Service.EventService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

  @GetMapping("/events/{venueId}/{eventType}")
  public ResponseEntity<?> getEventsByVenueIdAndEventType(@PathVariable Long venueId, @PathVariable String eventType) {
        List<Event> events=eventService.getEventsByVenueIdAndEventType(venueId, eventType);
      return ResponseEntity.ok(events.toString());
  }

}

