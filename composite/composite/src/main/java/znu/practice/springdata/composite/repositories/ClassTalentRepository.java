package znu.practice.springdata.composite.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.composite.entities.ClassTalent;
import znu.practice.springdata.composite.entities.ClassTalentId;

public interface ClassTalentRepository extends CrudRepository<ClassTalent, ClassTalentId> {

}