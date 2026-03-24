package GiorgiaFormicola.dao;

import GiorgiaFormicola.entities.Event;
import GiorgiaFormicola.exceptions.EventAlreadySavedException;
import GiorgiaFormicola.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.hibernate.exception.ConstraintViolationException;

public class EventsDAO {
    private final EntityManager entityManager;

    public EventsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Event newEvent) {
        EntityTransaction transaction = this.entityManager.getTransaction();
        transaction.begin();
        try {
            entityManager.persist(newEvent);
        } catch (ConstraintViolationException e) {
            throw new EventAlreadySavedException(newEvent);
        }
        transaction.commit();
        System.out.println("The event " + newEvent.getTitle() + " has been saved successfully!");
    }

    public Event getById(long id) {
        Event eventFound = entityManager.find(Event.class, id);
        if (eventFound == null) throw new NotFoundException(id);
        return eventFound;
    }

    public void delete(long id) {
        Event eventFound = this.getById(id);
        EntityTransaction transaction = this.entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(eventFound);
        transaction.commit();
        System.out.println("The event " + eventFound.getTitle() + " has been removed successfully!");
    }
}
