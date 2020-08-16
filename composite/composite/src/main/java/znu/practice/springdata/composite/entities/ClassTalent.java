package znu.practice.springdata.composite.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.Data;

@Data
@Entity
public class ClassTalent {

  @EmbeddedId
  private ClassTalentId classTalentId;

  @ManyToOne
  @MapsId("userClassId")
  private UserClass userClass;

  private String name;

  private String type;

  @Override
  public String toString() {
    return "ClassTalent [userClassId=" + classTalentId.getUserClassId() + ", talentNo=" + classTalentId.getTalentNo()
        + ", name=" + name + ", type=" + type + "]";
  }

}