package znu.practice.springdata.idgenerators.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

  @Id
  long id;

  String name;

}