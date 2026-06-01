package java_study.day2;

public class Greeting {
  private final String name;

  public Greeting(String name) {
    this.name = name;
  }

  public String message() {
    return "Hello, " + name;
  }

  public static String staticMessage(String name) {
    return "Hi, " + name;
  }
}
