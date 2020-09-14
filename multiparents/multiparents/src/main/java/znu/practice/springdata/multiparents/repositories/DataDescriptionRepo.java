package znu.practice.springdata.multiparents.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.multiparents.entities.DataDescription;

public interface DataDescriptionRepo extends CrudRepository<DataDescription, Long> {

}
