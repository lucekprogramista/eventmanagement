package com.springdatarest.eventmanagement.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Objects;
import java.util.Set;

@Entity
public class Organizer extends AbstractEntity {

    public Organizer(){}

    private String name;
    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Organizer)obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
