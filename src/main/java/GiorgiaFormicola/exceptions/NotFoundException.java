package GiorgiaFormicola.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(long id) {
        super("Event with id " + id + " not found!");
    }
}
