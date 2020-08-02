package znu.practice.springdata.hibernateinheritance.repositories.join;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.hibernateinheritance.entities.join.PaymentInfo;

public interface PaymentInfoRepository extends CrudRepository<PaymentInfo, Integer> {

}