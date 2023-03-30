import java.util.*;
public class City{
  private String name;
  private int population;

  public City(String name, int population){
    this.name = name;
    this.population = population;
  }
  public String getName(){
    return name;
  }
  public int getPopulation(){
    return population;
  }
  public void setPopulation(int population){
    this.population = population;
  }
  public static void main(String args[]){
    ArrayList<City> cities = new ArrayList<City>();
    cities.add(new City("ABC", 78965412));
    cities.add(new City("XYZ", 86321457));
    cities.add(new City("PQR", 52136479));
    cities.add(new City("JKL", 25698741));

    for (City city : cities){
      System.out.println(city.getName() + ", Population: " + city.getPopulation());
    }
    cities.get(1).setPopulation(cities.get(1).getPopulation() + 30000000);

    System.out.println("Updated population of " + cities.get(1).getName() + ": " + cities.get(1).getPopulation());
  }
}
  