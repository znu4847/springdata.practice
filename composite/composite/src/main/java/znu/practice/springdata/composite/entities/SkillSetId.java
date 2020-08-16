package znu.practice.springdata.composite.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Embeddable
@EqualsAndHashCode
public class SkillSetId implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "character_id")
  private Long characterId;

  @Column(name = "seq")
  private Integer seq;

}