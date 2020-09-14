package znu.practice.springdata.multiparents.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class DataFileRelation {

  @EmbeddedId
  private DataFileRelationId id;

  // for two parents, MapsId and JoinColumn annotations are needed

  @ManyToOne
  @MapsId("dataId")
  @JoinColumn(name = "data_id")
  private DataMain dataMain;

  @OneToOne
  @MapsId("fileInfoId")
  @JoinColumn(name = "file_info_id")
  private FileInfo fileInfo;

}
