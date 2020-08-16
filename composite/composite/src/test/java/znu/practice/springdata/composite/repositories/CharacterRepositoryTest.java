package znu.practice.springdata.composite.repositories;

import java.util.List;

import com.google.common.collect.Lists;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.composite.entities.Character;

@SpringBootTest
public class CharacterRepositoryTest {

  @Autowired
  CharacterRepository repo;

  @Test
  public void save() {

    Character kaya = new Character();
    kaya.setName("kaya");

    Character homare = new Character();
    homare.setName("homare");

    repo.save(kaya);
    repo.save(homare);

    List<Character> chList = Lists.newArrayList(repo.findAll());
    chList.forEach(System.out::println);

  }
}