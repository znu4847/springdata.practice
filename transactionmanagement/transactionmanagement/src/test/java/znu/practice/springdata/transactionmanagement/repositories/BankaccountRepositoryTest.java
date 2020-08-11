package znu.practice.springdata.transactionmanagement.repositories;

import java.util.List;

import com.google.common.collect.Lists;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.transactionmanagement.entities.BankAccount;

@SpringBootTest
public class BankaccountRepositoryTest {

  @Autowired
  BankaccountRepository repo;

  @Test
  public void save() {
    BankAccount acc1 = new BankAccount();
    acc1.setFirstname("kaya");
    acc1.setLastname("makoto");
    acc1.setBalance(1000);

    BankAccount acc2 = new BankAccount();
    acc2.setFirstname("inori");
    acc2.setLastname("akane");
    acc2.setBalance(2000);

    List<BankAccount> list = Lists.newArrayList();
    list.add(acc1);
    list.add(acc2);

    repo.saveAll(list);

  }

}