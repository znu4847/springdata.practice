package znu.practice.springdata.multiparents.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Embeddable
@EqualsAndHashCode
public class DataFileRelationId implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "data_id")
  private Long dataId;

  @Column(name = "file_info_id")
  private Long fileInfoId;

}
