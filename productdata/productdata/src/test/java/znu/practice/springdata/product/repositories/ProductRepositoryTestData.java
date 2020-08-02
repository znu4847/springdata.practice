package znu.practice.springdata.product.repositories;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.product.csv.CsvDataLoader;
import znu.practice.springdata.product.entities.Product;

@SpringBootTest
public class ProductRepositoryTestData {

  @Autowired
  ProductRepository repo;

  @Autowired
  CsvDataLoader loader;

  @Test
  public void insertTestData() {

    List<Product> datas = loader.loadObjectList(Product.class, "static/ut-data/product.01.csv");
    repo.saveAll(datas);
  }

}