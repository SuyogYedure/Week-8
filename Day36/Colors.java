import java.util.LinkedList;
public class Colors {
    public static void main(String args[]) {
      
        LinkedList<String> colors = new LinkedList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Colors in the LinkedList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
