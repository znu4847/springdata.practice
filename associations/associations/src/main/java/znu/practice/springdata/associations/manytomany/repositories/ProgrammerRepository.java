package znu.practice.springdata.associations.manytomany.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.associations.manytomany.entities.Programmer;

public interface ProgrammerRepository extends CrudRepository<Programmer, Long> {

}