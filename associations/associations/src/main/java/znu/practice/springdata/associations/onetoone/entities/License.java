package znu.practice.springdata.associations.onetoone.entities;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class License {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "person_id")
  private Person person;

  private String type;

  // @Temporal(TemporalType.DATE)
  // private Date validFrom;

  // @Temporal(TemporalType.DATE)
  // private Date validTo;
  @Column(name = "valid_from", columnDefinition = "DATE")
  private LocalDate validFrom;

  @Column(name = "valid_to", columnDefinition = "DATE")
  private LocalDate validTo;

  @Override
  public String toString() {
    return "License [id=" + id + ", type=" + type + ", validFrom=" + validFrom + ", validTo=" + validTo + "]";
  }

}