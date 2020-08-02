package znu.practice.springdata.hibernateinheritance.entities.perclass;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "bankcheck")
public class Bankcheck extends PaymentPerClass {

  private String checknumber;

}