import java.util.HashMap;
import java.util.Map;

public class Example2 {
  public static void main(String[] args) {
  
    Map<String, Integer> map = new HashMap<>();

    map.put("ABC", 98);
    map.put("PQR", 52);
    map.put("XYZ", 45);

    int value = map.get("ABC");

    System.out.println(value);
  }
}
