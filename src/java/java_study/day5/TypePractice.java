package java_study.day5;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class TypePractice {
  public Optional<String> findName(boolean exists) {
    if (exists) {
      return Optional.of("Alice");
    }
    return Optional.empty();
  }

  public UUID createUUID() {
    return UUID.randomUUID();
  }

  public String[] createArray() {
    return new String[]{"red", "green", "blue"};
  }

  public String firstItem(List<String> items) {
    return items.get(0);
  }
}
