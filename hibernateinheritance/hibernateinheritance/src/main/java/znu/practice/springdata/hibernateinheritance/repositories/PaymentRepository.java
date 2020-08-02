package znu.practice.springdata.hibernateinheritance.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}