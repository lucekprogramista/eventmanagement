package com.springdatarest.eventmanagement.repos;

import com.springdatarest.eventmanagement.entities.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@RepositoryRestResource
@Table(name = "EVENT")
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}
