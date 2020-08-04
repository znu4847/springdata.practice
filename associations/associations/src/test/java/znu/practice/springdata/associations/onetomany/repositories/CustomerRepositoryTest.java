package znu.practice.springdata.associations.onetomany.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.LazyInitializationException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.associations.onetomany.entities.Customer;
import znu.practice.springdata.associations.onetomany.entities.PhoneNumber;

@SpringBootTest
public class CustomerRepositoryTest {

  @Autowired
  CustomerRepository repo;

  @Test
  public void save() {
    Customer customer = new Customer();
    customer.setName("kaya");

    PhoneNumber ph1 = new PhoneNumber();
    ph1.setNumber("123-1234-12345");
    ph1.setType("cell");
    ph1.setCustomer(customer);
    customer.addPhoneNumber(ph1);

    PhoneNumber ph2 = new PhoneNumber();
    ph2.setNumber("012-345-6789");
    ph2.setType("home");
    ph2.setCustomer(customer);
    customer.addPhoneNumber(ph2);

    repo.save(customer);

  }

  @Test
  // @Transactional
  public void fetch() {
    Customer customer = repo.findById(4L).get();
    System.out.println("------ name : " + customer.getName());

    List<PhoneNumber> numbers = customer.getNumbers();
    try {
      numbers.forEach(num -> System.out.println(num.getNumber()));
    } catch (LazyInitializationException le) {
    }
  }

  @Test
  public void update() {
    Customer customer = repo.findById(4L).get();
    customer.setName("inori");

    List<PhoneNumber> numbers = customer.getNumbers();
    numbers.forEach(num -> num.setType("cell"));

    repo.save(customer);

    Customer customerAft = repo.findById(4L).get();
    System.out.println(customerAft.getName());
  }

  @Test
  public void delete() {
    repo.deleteById(4L);
  }

}