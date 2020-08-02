package znu.practice.springdata.hibernateinheritance.entities.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("cc")
public class CreditCard extends PaymentSingle {

  private String cardnumber;

}