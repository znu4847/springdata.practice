package znu.practice.springdata.hibernateinheritance.repositories.single;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.hibernateinheritance.entities.single.Check;
import znu.practice.springdata.hibernateinheritance.entities.single.CreditCard;

@SpringBootTest
public class PaymentSingleRepositoryTest {

  @Autowired
  PaymentSingleRepository repo;

  @Test
  public void createCreditCardPayment() {
    CreditCard cc = new CreditCard();
    cc.setId(123);
    cc.setAmount(1201);
    cc.setCardnumber("1234567890");

    repo.save(cc);
  }

  @Test
  public void createCheckPayment() {
    Check ch = new Check();
    ch.setId(124);
    ch.setAmount(1300);
    ch.setChecknumber("999444222");

    repo.save(ch);
  }

}