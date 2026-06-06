package java_study.day6;

import java.io.IOException;

public class ExceptionPractice {
  public String getName(boolean exists) {
    if (exists) {
      return "Alice";
    }
    return null;
  }

  public int nameLength(boolean exists) {
    String name = getName(exists);
    return name.length();
  }

  public void validateAge(int age) {
    if (age < 0) {
      throw new IllegalArgumentException("Age cannot be negative");
    }
  }

  public String readData(boolean fail) throws IOException {
    if (fail) {
      throw new IOException("read failed");
    }
    return "success";
  }
}
