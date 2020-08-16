package znu.practice.springdata.composite.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.composite.entities.Character;
import znu.practice.springdata.composite.entities.SkillSet;
import znu.practice.springdata.composite.entities.SkillSetId;

@SpringBootTest
public class SkillSetRepositoryTest {

  @Autowired
  SkillSetRepository repo;

  @Autowired
  CharacterRepository chRepo;

  @Test
  public void save() {

    Character kaya = chRepo.findById(1L).get();

    SkillSetId id1 = new SkillSetId();
    id1.setCharacterId(1L);
    id1.setSeq(1);

    SkillSet skill1 = new SkillSet();
    skill1.setSkillSetId(id1);
    skill1.setName("punch");
    skill1.setType("auto-attack");
    skill1.setDescription("normal auto-attack");

    SkillSetId id2 = new SkillSetId();
    id2.setCharacterId(1L);
    id2.setSeq(2);

    SkillSet skill2 = new SkillSet();
    skill2.setSkillSetId(id2);
    skill2.setName("uppercut");
    skill2.setType("special-attack");
    skill2.setDescription("powerful attack");

    repo.save(skill1);
    repo.save(skill2);

  }

  @Test
  public void delete() {

    SkillSetId id = new SkillSetId();
    id.setCharacterId(1L);
    id.setSeq(2);
    SkillSet skill = new SkillSet();

    skill.setSkillSetId(id);

    repo.delete(skill);
  }

}