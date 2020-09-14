package znu.practice.springdata.multiparents.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class DataMain {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long dataId;

  @OneToOne(mappedBy = "dataMain", cascade = CascadeType.ALL)
  private DataDescription dataDescription;

  @OneToMany(mappedBy = "dataMain")
  private List<DataFileRelation> dataFileRelation;

  private String name;

}
