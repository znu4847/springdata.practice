package znu.practice.springdata.hibernateinheritance.entities.join;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "card_info")
@PrimaryKeyJoinColumn(name = "id")
public class CardInfo extends PaymentInfo {

  private String cardnumber;

}