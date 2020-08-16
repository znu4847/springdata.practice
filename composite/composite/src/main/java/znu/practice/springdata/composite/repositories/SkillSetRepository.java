package znu.practice.springdata.composite.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.composite.entities.SkillSet;
import znu.practice.springdata.composite.entities.SkillSetId;

public interface SkillSetRepository extends CrudRepository<SkillSet, SkillSetId> {

}