package java_study.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPractice {
  public static boolean containsKeyword(String text, String keyword) {
    return text.contains(keyword);
  }

  public static String beforeColon(String text) {
    int index = text.indexOf(":");
    if (index == -1) {
      return text;
    }
    return text.substring(0, index);
  }

  public static String[] splitByComma(String text) {
    return text.split(",");
  } 

  public static String replaceSpace(String text) {
    return text.replace(" ", "_");
  }

  public static String buildMessage(String name, String action) {
    StringBuilder builder = new StringBuilder();
    builder.append(name);
    builder.append(" ");
    builder.append(action);
    builder.append(".");
    return builder.toString();
  }

  public static String firstNumber(String text) {
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(text);
    
    if (matcher.find()) {
      return matcher.group();
    }
    return "";
  }
}
