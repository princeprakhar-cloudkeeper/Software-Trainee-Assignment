import java.util.Scanner;
class Book{
    private String title;
    private String author;
    private double price;

    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Title: " + title + ", author: "+ author+ ", price: "+price;
    }

}
public class Main{
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);
        Book book = new Book("Sherlock Homes","Sir Authur",999.99);
       System.out.println(book.toString()); 
    }
}
