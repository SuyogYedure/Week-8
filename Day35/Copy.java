import java.util.*;
public class Copy {
    public static void main(String args[]) {
        
        ArrayList<String> mainList = new ArrayList<String>();
        mainList.add("apple");
        mainList.add("banana");
        mainList.add("cherry");

        ArrayList<String> copyList = new ArrayList<String>();
        for (String element : mainList) {
            copyList.add(element);
        }
        System.out.println("Original list: " + mainList);
        System.out.println("Copied list: " + copyList);
    }
}
