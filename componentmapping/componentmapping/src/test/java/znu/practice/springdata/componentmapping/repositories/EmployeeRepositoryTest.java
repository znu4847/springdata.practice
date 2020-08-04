package znu.practice.springdata.componentmapping.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.componentmapping.entities.Address;
import znu.practice.springdata.componentmapping.entities.Employee;

@SpringBootTest
public class EmployeeRepositoryTest {

  @Autowired
  EmployeeRepository repo;

  @Test
  public void save() {
    Employee emp = new Employee();
    emp.setId(123);
    emp.setName("kaya");

    Address add = new Address();
    add.setCity("Kawasaki");
    add.setStreetaddress("nagao");
    add.setCountry("JPN");
    add.setZipcode("123-4567");
    add.setState("kanagawa");
    emp.setAddress(add);

    repo.save(emp);

  }

}