import java.util.*;
import java.util.Collections;
public class Join {
    public static void main(String[] args) {
      
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        ArrayList<Integer> joinedList = new ArrayList<Integer>(list1);
        joinedList.addAll(list2);

        System.out.println("Joined list: " + joinedList);
    }
}
