package znu.practice.springdata.hibernateinheritance.entities.perclass;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "card")
public class CreditCardPerClass extends PaymentPerClass {

  private String cardnumber;

}