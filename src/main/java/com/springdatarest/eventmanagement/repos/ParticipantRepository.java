package com.springdatarest.eventmanagement.repos;

import com.springdatarest.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface ParticipantRepository extends CrudRepository<Event, Long> {
}
