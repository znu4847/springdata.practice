package znu.practice.springdata.componentmapping.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.componentmapping.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}