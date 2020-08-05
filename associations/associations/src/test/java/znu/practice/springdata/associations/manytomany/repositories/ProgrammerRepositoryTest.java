package znu.practice.springdata.associations.manytomany.repositories;

import java.util.List;

import com.google.common.collect.Lists;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import znu.practice.springdata.associations.manytomany.entities.Programmer;
import znu.practice.springdata.associations.manytomany.entities.Project;

@SpringBootTest
public class ProgrammerRepositoryTest {

  @Autowired
  ProgrammerRepository repo;

  @Test
  public void save() {
    Programmer programmer = new Programmer();
    programmer.setName("kaya");
    programmer.setSal(1000);

    List<Project> projects = Lists.newArrayList();

    Project prj1 = new Project();
    prj1.setName("Hibernate project");
    projects.add(prj1);

    programmer.setProjects(projects);

    repo.save(programmer);

  }

  @Test
  // @Transactional
  public void findProgrammer() {
    Programmer programmer = repo.findById(2L).get();
    System.out.println(programmer);
    System.out.println(programmer.getProjects());

  }

}