package znu.practice.springdata.multiparents.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.multiparents.entities.DataMain;

public interface DataMainRepo extends CrudRepository<DataMain, Long> {

}
