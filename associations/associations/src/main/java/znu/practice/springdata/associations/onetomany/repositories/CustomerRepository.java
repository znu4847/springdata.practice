package znu.practice.springdata.associations.onetomany.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.associations.onetomany.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}