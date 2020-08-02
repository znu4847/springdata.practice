package znu.practice.springdata.hibernateinheritance.repositories.join;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.hibernateinheritance.entities.join.CardInfo;

public interface CardInfoRepository extends CrudRepository<CardInfo, Integer> {

}