import java.util.ArrayList;
import java.util.Scanner;
class Product{
  String productName;
  String id;
  double price;

  Product(String productName, String id, double price){
    this.productName = productName;
    this.id = id;
    this.price = price;
  }
  public String getProductName(){
    return productName;
  }
  public void setProductName(String productName){
    this.productName = productName;
  }
  public String getId(){
    return id;
  }
  public void setId(String id){
    this.id = id;
  }
  public double getPrice(){
    return price;
  }
  public void SetPrice(double price){
    this.price = price;
  }
}
class ProductList{
  ArrayList<Product> products = new ArrayList<Product>();
  Scanner s = new Scanner(System.in);

  void addProduct(Product product){
    products.add(product);
  }
  void removeProduct(Product product){
    if(products.contains(product)){
       products.remove(product);
      System.out.println("Product found and removed");
    }
    else{
      System.out.println("Product not found ");
    }
    
  }
}
class ProductDemo{
  public static void main(String args[]){
    Scanner s = new Scanner (System.in);
    ProductList obj = new ProductList();
    for(int i=0; i<5; i++){
      System.out.println("Enter Product" + (i+1) + "details");
      obj.addProduct(new Product(s.next(), s.next(), s.nextDouble()));
    }
    obj.removeProduct(new Product("rty", "ddd", 4000000));
    
  }
}