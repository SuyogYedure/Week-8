import java.util.*;
public class Empty{
   public static void main(String args[]) {
     
      ArrayList<String> list = new ArrayList<String>();

      list.add("ABC");
      list.add("XYZ");
      list.add("JKL");
     
      System.out.println("Original ArrayList: " + list);
     
      list.clear();
     
      System.out.println("Empty ArrayList: " + list);
   }
}
