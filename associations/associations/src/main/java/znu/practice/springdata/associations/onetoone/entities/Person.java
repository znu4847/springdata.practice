package znu.practice.springdata.associations.onetoone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(mappedBy = "person")
  private License license;

  private String firstName;

  private String lastName;

  private Integer age;

  @Override
  public String toString() {
    return "Person [age=" + age + ", firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + "]";
  }

}