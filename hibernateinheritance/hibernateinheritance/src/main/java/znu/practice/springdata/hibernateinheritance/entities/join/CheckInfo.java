package znu.practice.springdata.hibernateinheritance.entities.join;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class CheckInfo extends PaymentInfo {

  private String checknumber;

}