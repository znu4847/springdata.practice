package znu.practice.springdata.jpqlandnativesql.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import znu.practice.springdata.jpqlandnativesql.entities.Student;

@SpringBootTest
public class StudentRepositoryTest {

  @Autowired
  StudentRepository repo;

  @Test
  public void findAllStudents() {
    List<Student> students = repo.findAllStudents();
    students.forEach(std -> System.out.println(std));
  }

  @Test
  public void findFindAllStudentsPartial() {
    List<Object[]> students = repo.findAllStudentsPartialData();
    students.forEach(obj -> {
      System.out.println(obj[0] + ", " + obj[1]);
    });
  }

  @Test
  public void findAllStudentsByFirstName() {
    List<Student> students = repo.findAllStudentsByFirstName("hatune");
    students.forEach(std -> System.out.println(std));
  }

  @Test
  @Transactional
  @Rollback(false)
  public void deleteStudentsByFirstName() {
    repo.deleteStudentsByFirstName("inori");
  }

  @Test
  public void findAllStudentsNQ() {
    List<Student> students = repo.findAllStudentNQ();
    System.out.println(students);
  }

  @Test
  public void findFirstNameNQ() {
    List<Student> students = repo.findByFirstNameNQ("kaya");
    System.out.println(students);
  }
}