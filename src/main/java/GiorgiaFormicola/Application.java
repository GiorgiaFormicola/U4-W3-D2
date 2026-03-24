package GiorgiaFormicola;

import GiorgiaFormicola.dao.EventsDAO;
import GiorgiaFormicola.entities.Event;
import GiorgiaFormicola.enums.EventType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("events_management_pu");

    public static void main(String[] args) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EventsDAO eventsDAO = new EventsDAO(entityManager);

        Event event1 = new Event("Coldplay Concert", 2026, 6, 15, "Amazing concert", EventType.PUBLIC, 70634);
        Event event2 = new Event("Louis C.K. Show", 2025, 3, 1, "Hilarious stand-up comedy", EventType.PUBLIC, 1500);
        Event event3 = new Event("Architecture Conference", 2027, 1, 12, "Conference on the latest trends in architecture field", EventType.PRIVATE, 300);

       /* System.out.println(event1);
        System.out.println(event2);
        System.out.println(event3);*/

        /*try {
            eventsDAO.save(event1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            eventsDAO.save(event2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            eventsDAO.save(event3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            eventsDAO.save(event3);
        } catch (EventAlreadySavedException e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            Event event1FromDB = eventsDAO.getById(1);
            System.out.println(event1FromDB);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Event event4FromDB = eventsDAO.getById(4);
            System.out.println(event4FromDB);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            eventsDAO.delete(1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            eventsDAO.delete(1);
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }*/

        entityManager.close();
        entityManagerFactory.close();
    }
}
