import java.util.*;
public class Rectangle{
  private double length;
  private double width;

  public Rectangle(double length, double width){
    this.length = length;
    this.width = width;
  }
  public double getLength(){
    return length;
  }
  public double getWidth(){
    return width;
  }
  public double getArea(){
    return length * width;
  }
  public static void main(String args[]){
    ArrayList<Rectangle> rect = new ArrayList<Rectangle>();
    rect.add(new Rectangle(4.5,7.8));
    rect.add(new Rectangle(2.6,6.3));
    rect.add(new Rectangle(7.4,3.8));
    rect.add(new Rectangle(6.7,5.9));

    for (Rectangle rectangle : rect){
      System.out.println("Length: " + rectangle.getLength() + ", Width: " + rectangle.getWidth());
    }
    for (Rectangle rectangle : rect){
      System.out.println("Area: " + rectangle.getArea());
    }
  }
}