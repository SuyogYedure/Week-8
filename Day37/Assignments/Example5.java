import java.util.HashMap;
import java.util.Map;

public class Example5 {
  public static void main(String[] args) {
  
    Map<String, Integer> map = new HashMap<>();

    map.put("ABC", 56);
    map.put("XYZ", 45);
    map.put("PQR", 32);

    for (String key : map.keySet()) {
      int value = map.get(key);
      System.out.println(key + ": " + value);
    }
  }
}
