import java.util.*;
import java.util.Collections;
public class Reverse {
    public static void main(String[] args) {
    
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("Mango");

        Collections.reverse(list);

        System.out.println("Reversed list: " + list);
    }
}
