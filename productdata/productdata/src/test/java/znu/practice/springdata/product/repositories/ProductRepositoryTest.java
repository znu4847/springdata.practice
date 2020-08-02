package znu.practice.springdata.product.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.product.entities.Product;

@SpringBootTest
public class ProductRepositoryTest {

  @Autowired
  ProductRepository repo;

  @Test
  public void create() {
    Product prd = new Product();
    prd.setId(1);
    prd.setDesc("iPhone");
    prd.setName("iPhone");
    prd.setPrice(100d);

    repo.save(prd);
  }

  @Test
  public void findAll() {
    List<Product> select = Lists.newArrayList(repo.findAll());
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByOne() {
    Optional<Product> row = repo.findById(1);

    assertNotNull(row.get());
    Product prd = row.get();
    assertEquals("iPhone", prd.getName());
    System.out.println(String.format("product : %d, %s, %s", prd.getId(), prd.getName(), prd.getDesc()));
  }

  @Test
  public void update() {
    Product prd = repo.findById(1).get();
    System.out
        .println(String.format("product : %d, %s, %s, %s", prd.getId(), prd.getName(), prd.getDesc(), prd.getPrice()));
    prd.setPrice(110.0d);
    prd.setDesc("this is iphone");
    repo.save(prd);

    Product updatedPrd = repo.findById(1).get();
    System.out.println(String.format("product : %d, %s, %s, %s", updatedPrd.getId(), updatedPrd.getName(),
        updatedPrd.getDesc(), updatedPrd.getPrice()));
    assertEquals("this is iphone", updatedPrd.getDesc());
    assertEquals(110d, updatedPrd.getPrice());
  }

  @Test
  public void delete() {
    repo.deleteById(1);
    Optional<Product> row = repo.findById(1);
    assertTrue(!row.isPresent());
  }

  @Test
  public void generationValue() {
    Product prd = new Product();
    prd.setName("Galaxy S20");
    prd.setDesc("Samsung Galaxy S20");
    prd.setPrice(100.0d);

    repo.save(prd);
    List<Product> select = Lists.newArrayList(repo.findAll());
    select.forEach(row -> System.out.println(row));

    // repo.findById(entity.getId());
    // assertEquals(entity.getName(), prd.getName());
  }

  @Test
  public void findByName() {
    List<Product> select = repo.findByName("IWatch");
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByNameAndDesc() {
    List<Product> select = repo.findByNameAndDesc("TV", " from Samsung Inc");
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByPriceGreaterThan() {
    List<Product> select = repo.findByPriceGreaterThan(1000d);
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByPriceGreaterThanEqual() {
    List<Product> select = repo.findByPriceGreaterThanEqual(1000d);
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByNameContains() {
    List<Product> select = repo.findByDescContains("from");
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByPriceBetween() {
    // List<Product> select = repo.findByPriceBetween(1600d, 1300d); <-- not working
    List<Product> select = repo.findByPriceBetween(1300d, 1600d);
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByDescLike() {
    List<Product> select = repo.findByDescLike("%LG%");
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

  @Test
  public void findByIdIn() {
    List<Product> select = repo.findByIdIn(Sets.newHashSet(14, 15, 16));
    System.out.println(select.size());
    select.forEach(row -> System.out.println(row));
  }

}