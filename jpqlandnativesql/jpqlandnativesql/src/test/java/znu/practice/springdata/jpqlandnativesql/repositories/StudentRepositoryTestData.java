package znu.practice.springdata.jpqlandnativesql.repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.jpqlandnativesql.csv.CsvDataLoader;
import znu.practice.springdata.jpqlandnativesql.entities.Student;

@SpringBootTest
public class StudentRepositoryTestData {

  @Autowired
  StudentRepository repo;

  @Autowired
  CsvDataLoader loader;

  @Test
  public void createData() {

    List<Student> datas = loader.loadObjectList(Student.class, "static/ut-data/student.01.csv");
    repo.saveAll(datas);

  }

}