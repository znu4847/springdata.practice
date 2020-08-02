package znu.practice.springdata.hibernateinheritance.entities.perclass;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PaymentPerClass {

  @Id
  private int id;

  private double amount;

}