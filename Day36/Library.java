import java.util.*;
class Book {
  private String title, author, publisher;
  private int bookNo;
  
  Book(String title, String author, String publisher, int bookNo) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setBookNo(bookNo);
    }
  void setTitle(String title) {
    this.title = title;
  }
  void setAuthor(String author) {
    this.author = author;
  }
  void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  void setBookNo(int bookNo) {
    this.bookNo = bookNo;
  }
  String getTitle() {
    return title;
  }
  String getAuthor() {
    return author;
  }
  String getPublisher() {
    return publisher;
  }
  int getBookNo() {
    return bookNo;
  }
}
public class Library {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    ArrayList<Book> books = new ArrayList<Book>();
    for (int i = 0; i < 5; i++) {
      books.add(new Book(s.next(), s.next(), s.next(), s.nextInt()));
    }
    for (Book book : books) {
      System.out.println(book.getBookNo() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher());
        }
    }
}