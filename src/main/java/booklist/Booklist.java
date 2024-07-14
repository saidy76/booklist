package booklist;
import java.util.ArrayList;

import java.util.Scanner;

public class Booklist {
    public static class Book{
         
        public String title;
public String author;
public int year;
public  String genre ;

public Book(String title,int year, String author,String genre){
    
    this.title=title;
    this.year=year;
    this.author=author;
    this.genre=genre;
   }
 public void display() {
        System.out.println("Book title: " + title);
        System.out.println("Release year: " + year);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println();
    }
    
}

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       ArrayList<Book> bookList = new ArrayList<>();
       

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");

            System.out.print("Enter book title: ");
            String title = sc.nextLine();

            System.out.print("Enter release year: ");
            int year = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter author's name: ");
 
            String author = sc.nextLine();
       
            
             System.out.print("Enter genre : ");
            String genre  = sc.nextLine();


            bookList.add(new Book(title, year, author,genre));
            
        }

        for (Book book : bookList) {
            System.out.println("Book details:");
            book.display();
        }
      
    }
}
