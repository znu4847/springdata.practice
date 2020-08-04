package znu.practice.springdata.associations.onetomany.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class PhoneNumber {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String number;

  private String type;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;

}