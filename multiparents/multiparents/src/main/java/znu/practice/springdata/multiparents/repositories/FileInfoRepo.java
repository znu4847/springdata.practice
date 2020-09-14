package znu.practice.springdata.multiparents.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.multiparents.entities.FileInfo;

public interface FileInfoRepo extends CrudRepository<FileInfo, Long> {

}
