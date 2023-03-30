import java.util.HashMap;
import java.util.Map;

public class Example10 {
  public static void main(String[] args) {

    Map<String, Integer> map1 = new HashMap<>();

    map1.put("ABC", 56);
    map1.put("XYZ", 45);
    map1.put("PQR", 32);

    Map<String, Integer> map2 = new HashMap<>();

    map2.putAll(map1);

    System.out.println("Second map after copying all key-value pairs from first map: " + map2);
  }
}
