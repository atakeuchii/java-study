package java_study.day8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePractice {
  public void writeFile(String filename, String content) throws IOException {
    Files.writeString(Path.of(filename), content);
  }

  public String readFile(String filename) throws IOException {
    return Files.readString(Path.of(filename));
  }

  public boolean exists(String filename) {
    return Files.exists(Path.of(filename));
  }
}
