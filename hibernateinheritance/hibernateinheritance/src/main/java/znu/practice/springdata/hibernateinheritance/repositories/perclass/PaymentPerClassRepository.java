package znu.practice.springdata.hibernateinheritance.repositories.perclass;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.hibernateinheritance.entities.perclass.PaymentPerClass;

public interface PaymentPerClassRepository extends CrudRepository<PaymentPerClass, Integer> {

}