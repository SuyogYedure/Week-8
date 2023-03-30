import java.util.*;
import java.util.Scanner;
public class Search {
    public static void main(String args[]) {
    
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int element = s.nextInt();
      
        int index = list.indexOf(element);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
