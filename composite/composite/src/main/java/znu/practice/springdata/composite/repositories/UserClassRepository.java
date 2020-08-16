package znu.practice.springdata.composite.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.composite.entities.UserClass;

public interface UserClassRepository extends CrudRepository<UserClass, Long> {

}