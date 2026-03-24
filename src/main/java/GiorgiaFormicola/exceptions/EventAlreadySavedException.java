package GiorgiaFormicola.exceptions;

import GiorgiaFormicola.entities.Event;

public class EventAlreadySavedException extends RuntimeException {
    public EventAlreadySavedException(Event newEvent) {

        super("The event " + newEvent.getTitle() + " is already saved in the database!");
    }
}
