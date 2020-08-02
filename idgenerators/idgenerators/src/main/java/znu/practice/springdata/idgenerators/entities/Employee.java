package znu.practice.springdata.idgenerators.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  long id;

  String name;

}