import java.util.HashMap;
import java.util.Map;
class MapDemo2{
  public static void main(String args[]){
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    map.put(100, "ABC");
    map.put(101, "PQR");
    map.put(102, "XYZ");
    System.out.println(map);
    for(Map.Entry m:map.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }
  }
}