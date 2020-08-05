package znu.practice.springdata.associations.onetoone.repositories;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import znu.practice.springdata.associations.onetoone.entities.License;
import znu.practice.springdata.associations.onetoone.entities.Person;

@SpringBootTest
public class LicenseRepositoryTest {

  @Autowired
  LicenseRepository repo;

  @Autowired
  PersonRepository personRepo;

  @Test
  public void save() {
    License license = new License();
    license.setType("driver");
    // license.setValidFrom(new Date());
    // license.setValidTo(new Date());
    license.setValidFrom(LocalDate.of(2020, 5, 1));
    license.setValidTo(LocalDate.of(2030, 6, 1));

    Person person = new Person();
    person.setFirstName("misato");
    person.setLastName("kouda");
    person.setAge(21);

    license.setPerson(person);

    // person.setLicense(license);

    personRepo.save(person);
    // repo.save(license);
  }

  @Test
  @Transactional
  public void deletePerson() {
    Person person = personRepo.findById(9L).get();
    License license = repo.findByPersonId(9L).get();
    System.out.println("----------------------- bef delete");
    System.out.println(license);
    System.out.println(license.getPerson());

    System.out.println("----------------------- aft delete");
    personRepo.delete(person);

    // personRepo.deleteById(9L);
    Optional<Person> delPerson = personRepo.findById(9L);
    Optional<License> delLicense = repo.findByPersonId(9L);
    if (delLicense.isPresent()) {
      System.out.println(delLicense.get());
      System.out.println(delLicense.get().getPerson());
    }
    System.out.println("----------------------- disp end");

    assertFalse(delPerson.isPresent());
    assertTrue(delLicense.isPresent());

  }

}