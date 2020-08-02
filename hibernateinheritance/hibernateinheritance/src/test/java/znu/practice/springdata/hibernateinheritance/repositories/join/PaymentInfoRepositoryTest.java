package znu.practice.springdata.hibernateinheritance.repositories.join;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.hibernateinheritance.entities.join.CardInfo;
import znu.practice.springdata.hibernateinheritance.entities.join.PaymentInfo;

@SpringBootTest
public class PaymentInfoRepositoryTest {

  @Autowired
  PaymentInfoRepository repo;

  @Autowired
  CardInfoRepository cardRepo;

  @Test
  public void createCard() {
    CardInfo ci = new CardInfo();
    ci.setId(113);
    ci.setAmount(103);
    ci.setCardnumber("12121112");
    repo.save(ci);
  }

  @Test
  public void findById() {
    PaymentInfo pm = repo.findById(113).get();
    System.out.println(pm.getId() + ", " + pm.getAmount());
    assertEquals(pm.getClass(), CardInfo.class);
  }

  @Test
  public void findByIdCardInfo() {
    CardInfo ci = cardRepo.findById(113).get();
    System.out.println(ci.getId() + ", " + ci.getAmount() + ", " + ci.getCardnumber());
  }
}