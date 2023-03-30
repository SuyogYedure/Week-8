import java.util.ArrayList;
public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("ABC", 22));
        people.add(new Person("XYZ", 30));
        people.add(new Person("PQR", 28));
        people.add(new Person("DEF", 27));
        people.add(new Person("JKL", 35));
        people.add(new Person("STU", 44));
        people.add(new Person("SNZ", 40 ));
        
        for (Person person : people) {
            System.out.println(person.getName() + ", " + person.getAge());
        }
        Person oldestPerson = people.get(0);
        for (Person person : people) {
            if (person.getAge() > oldestPerson.getAge()) {
                oldestPerson = person;
            }
        }
        System.out.println("Oldest person: " + oldestPerson.getName() + ", " + oldestPerson.getAge());
    }
}
