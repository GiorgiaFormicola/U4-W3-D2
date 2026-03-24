package GiorgiaFormicola.dao;

import GiorgiaFormicola.entities.Event;
import GiorgiaFormicola.exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventsDAO {
    private final EntityManager entityManager;

    public EventsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Event newEvent) {
        EntityTransaction transaction = this.entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(newEvent);
        transaction.commit();
        System.out.println("The event " + newEvent.getTitle() + " has been saved successfully");
    }

    public Event getById(long id) {
        Event eventFound = entityManager.find(Event.class, id);
        if (eventFound == null) throw new NotFoundException(id);
        return eventFound;
    }
}
