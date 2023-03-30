import java.util.*;
public class Extract{
    public static void main(String args[]) {
      
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> subList = new ArrayList<Integer>(list.subList(2, 4));
        System.out.println("Original list: " + list);
        System.out.println("Extracted list: " + subList);
    }
}
