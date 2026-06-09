package java_study.day9;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class UrlPractice {
  public URI createUri(String url) {
    return URI.create(url);
  }

  public String getHost(String url) {
    return URI.create(url).getHost();
  }

  public String getPath(String url) {
    return URI.create(url).getPath();
  }

  public String encode(String value) {
    return URLEncoder.encode(value, StandardCharsets.UTF_8);
  }
}
