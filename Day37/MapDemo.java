import java.util.HashMap;
class MapDemo{
  public static void main(String args[]){
    HashMap<Integer,String> map = new HashMap<Integer,String>();
    map.put(100, "ABC");
    map.put(101, "PQR");
    map.put(102, "XYZ");
    System.out.println(map);
  }
}