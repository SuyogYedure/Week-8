import java.util.*;
import java.util.Collections;
public class Swap {
    public static void main(String[] args) {
      
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("Mango");

        System.out.println("Original list: " + list);

        Collections.swap(list, 1, 3);

        System.out.println("Modified list: " + list);
    }
}
