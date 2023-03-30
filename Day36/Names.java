import java.util.Stack;
public class Names {
    public static void main(String args[]) {
      
        Stack<String> names = new Stack<String>();
        names.push("ABC");
        names.push("ASD");
        names.push("XYZ");
        names.push("PQR");

        System.out.println("Names in the Stack:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
