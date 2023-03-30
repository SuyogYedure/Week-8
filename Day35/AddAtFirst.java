import java.util.*;
public class AddAtFirst {
    public static void main(String args[]) {
    
        ArrayList<String> names = new ArrayList<String>();
        names.add("XYZ");
        names.add("ABC");
        names.add("PQR");

        names.add(0, "DEF");
        System.out.println("Names in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
