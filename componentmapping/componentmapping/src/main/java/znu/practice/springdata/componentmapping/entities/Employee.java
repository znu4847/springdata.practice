package znu.practice.springdata.componentmapping.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

  @Id
  private int id;

  private String name;

  @Embedded
  private Address address;

}