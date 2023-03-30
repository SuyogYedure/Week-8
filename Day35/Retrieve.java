import java.util.*;
public class Retrieve {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
      
        int element = numbers.get(2);
        System.out.println("Element at index 2 is: " + element);
    }
}
