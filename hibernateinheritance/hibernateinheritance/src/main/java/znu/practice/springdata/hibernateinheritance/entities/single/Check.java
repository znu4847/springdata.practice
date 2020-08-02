package znu.practice.springdata.hibernateinheritance.entities.single;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("ch")
public class Check extends PaymentSingle {

  private String checknumber;

}