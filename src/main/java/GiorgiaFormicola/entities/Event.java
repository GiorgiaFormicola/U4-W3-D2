package GiorgiaFormicola.entities;

import GiorgiaFormicola.enums.EventType;

import java.time.LocalDate;

public class Event {
    private long id;
    private String title;
    private LocalDate eventDate;
    private String description;
    private EventType eventType;
    private int maxNumberOfParticipants;

    //CONSTRUCTOR FOR JAVA
    Event(String title, int year, int month, int day, String description, EventType eventType, int maxNumberOfParticipants) {
        this.title = title;
        this.eventDate = LocalDate.of(year, month, day);
        this.description = description;
        this.eventType = eventType;
        this.maxNumberOfParticipants = maxNumberOfParticipants;
    }
    
    //GETTERS

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    //SETTERS

    public void setDescription(String description) {
        this.description = description;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getMaxNumberOfParticipants() {
        return maxNumberOfParticipants;
    }

    public void setMaxNumberOfParticipants(int maxNumberOfParticipants) {
        this.maxNumberOfParticipants = maxNumberOfParticipants;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate=" + eventDate +
                ", description='" + description + '\'' +
                ", eventType=" + eventType +
                ", maxNumberOfParticipants=" + maxNumberOfParticipants +
                '}';
    }
}
