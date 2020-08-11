package znu.practice.springdata.transactionmanagement.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.transactionmanagement.entities.BankAccount;

public interface BankaccountRepository extends CrudRepository<BankAccount, Integer> {

}