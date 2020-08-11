package znu.practice.springdata.transactionmanagement.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BankaccountServiceTest {

  @Autowired
  BankaccountService service;

  @Test
  public void transfer() {
    service.transfer(500);
  }

}