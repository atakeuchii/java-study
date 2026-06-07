package java_study.day7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.Timestamp;

public class DatePractice {

  public LocalDate today() {
    return LocalDate.now();
  }

  public LocalDate parseDate(String text) {
    return LocalDate.parse(text);
  }

  public String formatDate(LocalDate date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    return date.format(formatter);
  }

  public LocalDateTime now() {
    return LocalDateTime.now();
  }

  public Timestamp nowTimestamp() {
    return Timestamp.valueOf(LocalDateTime.now());
  }
}
