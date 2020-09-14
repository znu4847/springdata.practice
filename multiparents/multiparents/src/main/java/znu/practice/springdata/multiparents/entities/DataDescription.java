package znu.practice.springdata.multiparents.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class DataDescription {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long dataDescriptionId;

  @OneToOne
  @JoinColumn(name = "data_id")
  private DataMain dataMain;

  @OneToOne
  @JoinColumn(name = "file_info_id")
  private FileInfo fileInfo;

  private String description;

}
