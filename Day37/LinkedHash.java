class MapDemo{
  public static void main(String args[]){
    LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
    map.put(1,5689);
    map.put(2,35684);
    map.put(3,78521);
    
    if(map.containsValue(5689)){
      System.out.println("Found");
    }
    else{
      System.out.println("Not Found");
    }
  }
}
 