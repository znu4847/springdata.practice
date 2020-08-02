package znu.practice.springdata.jpqlandnativesql.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.jpqlandnativesql.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

  @Query("from Student") // not 's'tudent! pay attention to case sensitivity
  List<Student> findAllStudents();

  // @Query("select st.firstName, st.lastName from Student st") // same result
  @Query("select firstName, lastName from Student")
  List<Object[]> findAllStudentsPartialData();

  @Query("from Student where firstName=:firstName")
  List<Student> findAllStudentsByFirstName(String firstName);

  @Modifying
  @Query("delete from Student where firstName = :firstName")
  void deleteStudentsByFirstName(String firstName);

  @Query(value = "select * from spring_data.student", nativeQuery = true)
  List<Student> findAllStudentNQ();

  @Query(value = "select * from spring_data.student where fname=:firstName", nativeQuery = true)
  List<Student> findByFirstNameNQ(String firstName);
}