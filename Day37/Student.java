import java.util.*;
public class Student{
  private String name;
  private int id;
  private String major;

  public Student(String name, int id, String major){
    this.name = name;
    this.id = id;
    this.major = major;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public String getMajor(){
    return major;
  }
  public void setMajor(String major){
    this.major = major;
  }
  public static void main(String args[]){
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student("ABC", 100, "ME"));
    students.add(new Student("PQR", 101, "Phy"));
    students.add(new Student("XYZ", 102, "CHE"));
    students.add(new Student("ASD", 103, "Maths"));
    students.add(new Student("JKL", 104, "CS"));
    students.add(new Student("FGH", 105, "EC"));
    students.add(new Student("IJL", 106, "EE"));

    for(Student student: students){
      System.out.println(student.getName() + "," + student.getMajor());
    }
    students.get(3).setMajor("KOM");
    System.out.println("Updated major of " + students.get(3).getName() + "," + students.get(3).getMajor());
  }
}