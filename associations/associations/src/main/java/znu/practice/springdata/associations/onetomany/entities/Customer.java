package znu.practice.springdata.associations.onetomany.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  // @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch =
  // FetchType.EAGER)
  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL) // default : fetch = FetchType.LAZY
  private List<PhoneNumber> numbers;

  public void addPhoneNumber(PhoneNumber number) {
    if (number != null) {
      if (numbers == null) {
        numbers = new ArrayList<>();
      }
      number.setCustomer(this);
      numbers.add(number);
    }
  }

}