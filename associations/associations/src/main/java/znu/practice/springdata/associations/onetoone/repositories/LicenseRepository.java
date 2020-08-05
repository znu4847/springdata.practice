package znu.practice.springdata.associations.onetoone.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.associations.onetoone.entities.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

  void deleteByPersonId(Long personId);

  Optional<License> findByPersonId(Long personId);

}