package znu.practice.springdata.multiparents.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.multiparents.entities.DataFileRelation;
import znu.practice.springdata.multiparents.entities.DataFileRelationId;

public interface DataFileRelationRepo extends CrudRepository<DataFileRelation, DataFileRelationId> {

}
