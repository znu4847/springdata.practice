package znu.practice.springdata.product.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

import znu.practice.springdata.product.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

  List<Product> findByName(String name);

  List<Product> findByNameAndDesc(String name, String desc);

  List<Product> findByPriceGreaterThan(Double price);

  List<Product> findByPriceGreaterThanEqual(Double price);

  List<Product> findByDescContains(String desc);

  List<Product> findByPriceBetween(Double price1, Double price2);

  List<Product> findByDescLike(String desc);

  List<Product> findByIdIn(Set<Integer> ids);

}