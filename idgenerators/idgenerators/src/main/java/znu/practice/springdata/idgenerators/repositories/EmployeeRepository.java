package znu.practice.springdata.idgenerators.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.idgenerators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}