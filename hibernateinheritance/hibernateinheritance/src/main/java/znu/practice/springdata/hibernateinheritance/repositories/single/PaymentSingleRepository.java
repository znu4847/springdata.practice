package znu.practice.springdata.hibernateinheritance.repositories.single;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.hibernateinheritance.entities.single.PaymentSingle;

public interface PaymentSingleRepository extends CrudRepository<PaymentSingle, Integer> {

}