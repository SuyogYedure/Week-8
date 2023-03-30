import java.util.Vector;
public class Numbers {
    public static void main(String args[]) {
      
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(25);
        numbers.add(56);
        numbers.add(47);
        numbers.add(89);
        numbers.add(23);
      

        System.out.println("Numbers in the Vector:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
