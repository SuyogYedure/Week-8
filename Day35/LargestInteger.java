import java.util.*;
import java.util.Scanner;
public class LargestInteger {
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);

      ArrayList<Integer> list = new ArrayList<Integer>();

      System.out.print("Enter the integers: ");
      while (s.hasNextInt()) {
         list.add(s.nextInt());
      }
      int max = list.get(0);
      for (int i = 1; i < list.size(); i++) {
         if (list.get(i) > max) {
            max = list.get(i);
         }
      }
      System.out.println("The largest integer is: " + max);
   }
}
