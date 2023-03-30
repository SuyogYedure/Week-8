import java.util.*;
import java.util.Scanner;
public class OddInteger {
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);

      ArrayList<Integer> list = new ArrayList<Integer>();

      System.out.print("Enter integers (enter a non-integer to stop): ");
      while (s.hasNextInt()) {
         list.add(s.nextInt());
      }
      ArrayList<Integer> oddList = new ArrayList<Integer>();
      for (int i = 0; i < list.size(); i++) {
         if (list.get(i) % 2 != 0) {
            oddList.add(list.get(i));
         }
      }
      System.out.println("The odd integers are: " + oddList);
   }
}
