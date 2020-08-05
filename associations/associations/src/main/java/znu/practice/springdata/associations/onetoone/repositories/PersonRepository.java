package znu.practice.springdata.associations.onetoone.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.associations.onetoone.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}