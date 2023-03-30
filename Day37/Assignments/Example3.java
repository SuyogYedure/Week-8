import java.util.HashMap;
import java.util.Map;

public class Example3 {
  public static void main(String[] args) {
   
    Map<String, Integer> map = new HashMap<>();

    map.put("ABC", 56);
    map.put("XYZ", 45);
    map.put("PQR", 32);

    boolean isKeyPresent = map.containsKey("XYZ");

    System.out.println("Is the key present? " + isKeyPresent);
  }
}
