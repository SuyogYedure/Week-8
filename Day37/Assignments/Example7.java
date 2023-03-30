import java.util.HashMap;
import java.util.Map;

public class Example7 {
  public static void main(String[] args) {
    
    Map<String, Integer> map = new HashMap<>();

    map.put("ABC", 56);
    map.put("XYZ", 45);
    map.put("PQR", 32);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      int value = entry.getValue();
      System.out.println(key + ": " + value);
    }
  }
}
