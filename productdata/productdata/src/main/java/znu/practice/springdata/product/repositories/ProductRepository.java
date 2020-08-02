package znu.practice.springdata.product.repositories;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}