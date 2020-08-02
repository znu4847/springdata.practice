package znu.practice.springdata.hibernateinheritance.repositories.perclass;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.hibernateinheritance.entities.perclass.Bankcheck;
import znu.practice.springdata.hibernateinheritance.entities.perclass.CreditCardPerClass;
import znu.practice.springdata.hibernateinheritance.entities.perclass.PaymentPerClass;

@SpringBootTest
public class PaymentPerClassRepositoryTest {

  @Autowired
  PaymentPerClassRepository repo;

  @Test
  public void createCreditCard() {
    CreditCardPerClass cc = new CreditCardPerClass();
    cc.setId(123);
    cc.setAmount(1033);
    cc.setCardnumber("123412341234");
    repo.save(cc);
  }

  @Test
  public void createBankcheck() {
    Bankcheck bc = new Bankcheck();
    bc.setId(124);
    bc.setAmount(903);
    bc.setChecknumber("33913393");
    repo.save(bc);
  }

  @Test
  public void findBank() {
    PaymentPerClass row = repo.findById(123).get();
    System.out.println(row);

  }

}