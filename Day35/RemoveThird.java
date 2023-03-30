import java.util.*;
public class RemoveThird {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");

        System.out.println("Original list: " + list);
      
        list.remove(2);
      
        System.out.println("Updated list: " + list);
    }
}
