package znu.practice.springdata.hibernateinheritance.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
@DiscriminatorValue("ch")
public class Check extends Payment {

  private String checknumber;

}