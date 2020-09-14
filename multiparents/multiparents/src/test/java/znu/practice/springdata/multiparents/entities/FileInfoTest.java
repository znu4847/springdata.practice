package znu.practice.springdata.multiparents.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static znu.practice.springdata.multiparents.TestDataUtil.randomString;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import znu.practice.springdata.multiparents.repositories.FileInfoRepo;

@SpringBootTest
public class FileInfoTest {

  @Autowired
  FileInfoRepo repo;

  @Test
  public void savePtn1() {
    FileInfo fileInfo = new FileInfo();
    fileInfo.setFileName(randomString(5));

    FileInfo fileInfoSv = repo.save(fileInfo);
    Optional<FileInfo> sel = repo.findById(fileInfoSv.getFileInfoId());

    assertTrue(sel.isPresent());
    FileInfo fileInfoE = sel.get();
    assertEquals(fileInfo.getFileName(), fileInfoE.getFileName());

  }

}
