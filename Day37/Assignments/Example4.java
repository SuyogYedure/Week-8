import java.util.HashMap;
import java.util.Map;

public class Example4 {
  public static void main(String[] args) {
   
    Map<String, Integer> map = new HashMap<>();

    map.put("ABC", 56);
    map.put("XYZ", 45);
    map.put("PQR", 32);

    map.remove("PQR");

    System.out.println(map);
  }
}
