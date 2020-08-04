package znu.practice.springdata.associations.onetomany.repositories;

import java.util.ArrayList;
import java.util.List;

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
    // occours java.lang.StackOverFlowError by *.hashSet(..)
    // Set<PhoneNumber> numbers = new HashSet<>();
    List<PhoneNumber> numbers = new ArrayList<>();

    PhoneNumber ph1 = new PhoneNumber();
    ph1.setNumber("123-1234-12345");
    ph1.setType("cell");
    ph1.setCustomer(customer);
    numbers.add(ph1);

    PhoneNumber ph2 = new PhoneNumber();
    ph2.setNumber("012-345-6789");
    ph2.setType("home");
    ph2.setCustomer(customer);

    numbers.add(ph2);

    customer.setNumbers(numbers);

    repo.save(customer);

  }

}