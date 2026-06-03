package java_study.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionPractice {
  public List<String> createNames() {
    List<String> names = new ArrayList<>();

    names.add("Alice");
    names.add("Bob");
    names.add("Alice");

    return names;
  }

  public Map<String, Integer> createScores() {
    Map<String, Integer> scores = new HashMap<>();

    scores.put("Alice", 80);
    scores.put("Bob", 90);

    return scores;
  }

  public Set<String> createUniqueNames() {
    Set<String> names = new HashSet<>();

    names.add("Alice");
    names.add("Bob");
    names.add("Alice");

    return names;
  }

  public String joinByIterator(List<String> names) {
    StringBuilder builder = new StringBuilder();
    Iterator<String> iterator = names.iterator();

    while (iterator.hasNext()) {
      String name = iterator.next();
      builder.append(name);

      if (iterator.hasNext()) {
        builder.append(", ");
      }
    }

    return builder.toString();
  }

  public List<String> addName(List<String> names, String name) {
    names.add(name);
    return names;
  }
}
