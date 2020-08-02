package znu.practice.springdata.hibernateinheritance.entities.join;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "payment_info")
public abstract class PaymentInfo {

  @Id
  private int id;

  private double amount;

}