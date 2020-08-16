package znu.practice.springdata.composite.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class UserClass {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(mappedBy = "userClass", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<ClassTalent> talents;

  @Override
  public String toString() {

    return String.format("id : %d, name : %s", id, name);

  }
}