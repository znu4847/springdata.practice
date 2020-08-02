package znu.practice.springdata.idgenerators.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.idgenerators.entities.Employee;

@SpringBootTest
public class EmployeeRepositoryTest {

  @Autowired
  EmployeeRepository repo;

  @Test
  public void create() {
    Employee employee = new Employee();
    employee.setName("Mike");

    repo.save(employee);
  }

}