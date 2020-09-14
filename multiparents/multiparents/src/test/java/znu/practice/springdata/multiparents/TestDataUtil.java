package znu.practice.springdata.multiparents;

import org.apache.commons.lang3.RandomStringUtils;

public class TestDataUtil {

  public static String randomString(int length) {
    return RandomStringUtils.random(length, true, true);
  }

}
