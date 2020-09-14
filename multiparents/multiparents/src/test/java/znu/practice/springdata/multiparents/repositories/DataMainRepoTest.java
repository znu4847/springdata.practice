package znu.practice.springdata.multiparents.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static znu.practice.springdata.multiparents.TestDataUtil.randomString;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.multiparents.entities.DataDescription;
import znu.practice.springdata.multiparents.entities.DataMain;

@SpringBootTest
public class DataMainRepoTest {

  @Autowired
  DataMainRepo mainRepo;

  @Test
  public void savePtn1() {

    DataMain dataMain = new DataMain();
    dataMain.setName(randomString(4));

    DataDescription dataDescription = new DataDescription();
    dataDescription.setDescription(randomString(8));

    dataMain.setDataDescription(dataDescription);
    dataDescription.setDataMain(dataMain);

    DataMain dataMainSv = mainRepo.save(dataMain);
    Optional<DataMain> sel = mainRepo.findById(dataMainSv.getDataId());

    assertTrue(sel.isPresent());
    DataMain dataMainE = sel.get();
    DataDescription dataDescriptionE = dataMainE.getDataDescription();
    assertEquals(dataMain.getName(), dataMainE.getName());
    assertEquals(dataDescription.getDescription(), dataDescriptionE.getDescription());

  }

}
