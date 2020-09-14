package znu.practice.springdata.multiparents.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class FileInfo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long fileInfoId;

  @OneToOne(mappedBy = "fileInfo")
  private DataFileRelation dataFileRelation;

  @OneToOne(mappedBy = "fileInfo")
  private DataDescription dataDescription;

  @Lob
  private byte[] binaryData;

  private String fileName;

}
