package dta.example.h2dbmemory.repository;

import dta.example.h2dbmemory.data.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRep extends CrudRepository<Person, Long> {
}
