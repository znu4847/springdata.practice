package znu.practice.springdata.hibernateinheritance.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.hibernateinheritance.entities.Check;
import znu.practice.springdata.hibernateinheritance.entities.CreditCard;

@SpringBootTest
public class PaymentRepositoryTest {

  @Autowired
  PaymentRepository repo;

  @Test
  public void createCreditCardPayment() {
    CreditCard cc = new CreditCard();
    cc.setId(123);
    cc.setAmount(1000);
    cc.setCardnumber("1234567890");

    repo.save(cc);
  }

  @Test
  public void createCheckPayment() {
    Check ch = new Check();
    ch.setId(124);
    ch.setAmount(1000);
    ch.setChecknumber("999444222");

    repo.save(ch);
  }

}