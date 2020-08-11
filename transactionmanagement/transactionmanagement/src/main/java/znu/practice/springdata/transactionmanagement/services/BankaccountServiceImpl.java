package znu.practice.springdata.transactionmanagement.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import znu.practice.springdata.transactionmanagement.entities.BankAccount;
import znu.practice.springdata.transactionmanagement.repositories.BankaccountRepository;

@Service
public class BankaccountServiceImpl implements BankaccountService {

  @Autowired
  BankaccountRepository repo;

  @Override
  @Transactional
  public void transfer(int amount) {

    Optional<BankAccount> kayaAcc = repo.findById(1);
    Optional<BankAccount> inoriAcc = repo.findById(2);

    if (kayaAcc.isPresent()) {
      BankAccount kaya = kayaAcc.get();
      kaya.setBalance(kaya.getBalance() + amount);
      repo.save(kaya);
    }

    // transaction test
    if (amount == 500) {
      throw new RuntimeException();
    }

    if (inoriAcc.isPresent()) {
      BankAccount inori = inoriAcc.get();
      inori.setBalance(inori.getBalance() - amount);
      repo.save(inori);
    }
  }

}