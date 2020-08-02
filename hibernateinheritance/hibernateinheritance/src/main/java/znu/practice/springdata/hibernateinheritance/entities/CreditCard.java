package znu.practice.springdata.hibernateinheritance.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment {

  private String cardnumber;

}