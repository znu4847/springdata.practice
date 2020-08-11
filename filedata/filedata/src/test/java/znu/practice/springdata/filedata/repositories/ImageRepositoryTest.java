package znu.practice.springdata.filedata.repositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import znu.practice.springdata.filedata.entities.Image;

@SpringBootTest
public class ImageRepositoryTest {

  @Autowired
  ImageRepository repo;

  @Autowired
  ResourceLoader resourceLoader;

  @Test
  public void save() throws IOException {

    Image image = new Image();

    image.setName("kaya.png");
    Resource resource = resourceLoader.getResource("/img/kaya.png");
    File kayaImg = resource.getFile();
    byte fileContent[] = new byte[(int) kayaImg.length()];
    FileInputStream inputStream = new FileInputStream(kayaImg);

    inputStream.read(fileContent);

    image.setData(fileContent);

    repo.save(image);

    inputStream.close();

  }

  @Test
  public void readImg() throws IOException {

    Image img = repo.findById(1L).get();

    File file = new File("C:/_Dev/works/study/spring-data-jpa/springdata.practice/filedata/" + img.getName());
    FileOutputStream fos = new FileOutputStream(file);
    fos.write(img.getData());

    fos.close();

  }
}