package znu.practice.springdata.filedata.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.filedata.entities.Image;

public interface ImageRepository extends CrudRepository<Image, Long> {

}