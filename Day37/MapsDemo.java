import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Student{
  int rollno;
  String name;
  
  Student (int rollno, String name){
    this.rollno = rollno;
    this.name = name;
  }
}
class MapsDemo{
  public static void main(String args[]){
    LinkedHashMap<Integer,Student> map = new LinkedHashMap<Integer,Student>();
    Scanner s = new Scanner(System.in);
    for(int i=1; i<3;i++){
      map.put(i,new Student(s.nextInt(),s.next()));
    }
    for (Map.Entry m:map.entrySet()){
      Student st = (Student)m.getValue();
      System.out.println("key is" + m.getKey() + "value is" + m.getValue());
      System.out.println("Values are");

      System.out.println(st.rollno+" "+st.name);
    }
  }
}