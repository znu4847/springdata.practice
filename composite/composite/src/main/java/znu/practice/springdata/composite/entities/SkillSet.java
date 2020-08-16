package znu.practice.springdata.composite.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class SkillSet {

  @EmbeddedId
  private SkillSetId skillSetId;

  private String name;

  private String description;

  private String type;

}