import java.util.*;
import java.util.Collections;
public class Shuffle {
    public static void main(String args[]) {
       
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
    }
}
