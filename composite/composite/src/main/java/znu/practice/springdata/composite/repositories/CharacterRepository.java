package znu.practice.springdata.composite.repositories;

import org.springframework.data.repository.CrudRepository;
import znu.practice.springdata.composite.entities.Character;

public interface CharacterRepository extends CrudRepository<Character, Long> {

}