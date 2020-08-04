package znu.practice.springdata.componentmapping.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Embeddable
public class Address {

  private String streetaddress;

  private String city;

  private String state;

  private String zipcode;

  private String country;

}