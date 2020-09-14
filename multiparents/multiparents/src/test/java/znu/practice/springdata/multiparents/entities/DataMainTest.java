package znu.practice.springdata.multiparents.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static znu.practice.springdata.multiparents.TestDataUtil.randomString;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.multiparents.repositories.DataMainRepo;

@SpringBootTest
public class DataMainTest {

  @Autowired
  DataMainRepo repo;

  @Test
  public void test() {
    DataMain dataMain = new DataMain();
    dataMain.setName(randomString(4));
    DataMain dataMainSv = repo.save(dataMain);
    Optional<DataMain> sel = repo.findById(dataMainSv.getDataId());

    assertTrue(sel.isPresent());

    DataMain dataMainE = sel.get();
    assertEquals(dataMain.getName(), dataMainE.getName());
  }

}
