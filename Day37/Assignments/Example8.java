import java.util.HashMap;
import java.util.Map;

public class Example8 {
  public static void main(String[] args) {

    Map<String, Integer> map = new HashMap<>();

    map.put("ABC", 56);
    map.put("XYZ", 45);
    map.put("PQR", 32);

    int size = map.size();
    System.out.println("Size of map: " + size);
  }
}
