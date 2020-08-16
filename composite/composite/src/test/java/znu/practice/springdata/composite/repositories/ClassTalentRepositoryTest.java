package znu.practice.springdata.composite.repositories;

import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import znu.practice.springdata.composite.entities.ClassTalent;
import znu.practice.springdata.composite.entities.ClassTalentId;
import znu.practice.springdata.composite.entities.UserClass;

@SpringBootTest
public class ClassTalentRepositoryTest {

  @Autowired
  ClassTalentRepository repo;

  @Autowired
  UserClassRepository uRepo;

  @Test
  public void userClassTest() {

    UserClass uc = new UserClass();
    uc.setName("druid");

    uRepo.save(uc);

    List<UserClass> classList = Lists.newArrayList(uRepo.findAll());
    classList.forEach(System.out::println);

  }

  @Test
  public void savePtn1() {

    ClassTalentId cti1 = new ClassTalentId();

    UserClass druid = uRepo.findById(1L).get();

    cti1.setUserClassId(1L);
    cti1.setTalentNo(2);

    ClassTalent ct1 = new ClassTalent();
    ct1.setName("balance");
    ct1.setType("magical-dps");
    ct1.setUserClass(druid);
    ct1.setClassTalentId(cti1);
    repo.save(ct1);

  }

  @Test
  public void savePtn2() {

    ClassTalentId cti1 = new ClassTalentId();

    UserClass druid = new UserClass();
    druid.setId(1L);

    cti1.setUserClassId(1L);
    cti1.setTalentNo(3);

    ClassTalent ct1 = new ClassTalent();
    ct1.setName("restoration");
    ct1.setType("healer");
    ct1.setUserClass(druid);
    ct1.setClassTalentId(cti1);
    repo.save(ct1);

  }

  @Test
  public void savePtn3() {

    UserClass demonHunter = new UserClass();

    demonHunter.setName("demon hunter");

    ClassTalentId havocId = new ClassTalentId();
    havocId.setTalentNo(1);

    ClassTalent havoc = new ClassTalent();
    havoc.setClassTalentId(havocId);
    havoc.setName("havoc");
    havoc.setType("physical-dps");
    havoc.setUserClass(demonHunter);

    ClassTalentId vengenceId = new ClassTalentId();
    vengenceId.setTalentNo(2);

    ClassTalent vengence = new ClassTalent();
    vengence.setClassTalentId(vengenceId);
    vengence.setName("vengence");
    vengence.setType("dex-tanker");
    vengence.setUserClass(demonHunter);

    List<ClassTalent> talents = Lists.newArrayList(havoc, vengence);

    demonHunter.setTalents(talents);

    uRepo.save(demonHunter);
  }

  @Test
  public void findById() {

    ClassTalentId id = new ClassTalentId();
    id.setUserClassId(5L);
    id.setTalentNo(1);
    Optional<ClassTalent> sel = repo.findById(id);

    System.out.println("--- isPresent : " + sel.isPresent());
    if (sel.isPresent()) {
      System.out.println(sel.get().toString());
    }
  }

  @Test
  @Transactional
  public void findByIdFromUserClass() {

    Optional<UserClass> sel = uRepo.findById(5L);
    System.out.println("--- isPresent : " + sel.isPresent());
    if (sel.isPresent()) {
      System.out.println(sel.get());
      System.out.println("----- talents");
      sel.get().getTalents().forEach(System.out::println);

    }
  }

}