import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Biography1 {
    public static void main(String[] args) {

    /**
     * WORK ON BOOK AND AUTHOR CLASSES FIRST
     This will be our actual program that we define author and his books
     In this program we will write the biography of Stefan Zweig, an Austrian novelist.


     Write a program that will get information from user and
     -Print information for the favorite author
     -Print information of the books of favorite author

     Full name = Stefan Zweig
     County = Austria
     Is still alive: No (28 November 1881 – 22 February 1942)
     Some of his books as listed below:

     BookName                            Genre           TotalPage
     Amok                                tale            189
     The Royal Game                      novella         53
     24 Hours in the Life of a Woman     novella         80
     */
   Scanner scan =new Scanner(System.in);
   System.out.println("What is your favorite author’s first name?");
   String authorFName= scan.nextLine();
   System.out.println("What is your favorite author’s last name?");
   String authorLName=scan.nextLine();
   System.out.println("Where is your favorite author is from?");
   String country=scan.nextLine();
   System.out.println("Is your favorite author is alive? (Y/N)");
   String isAlive=scan.nextLine();
   boolean authorAlive=isAlive.equalsIgnoreCase("y");
   int age=MIN_VALUE;
   if(authorAlive) {
      System.out.println("How old is your author?");
      age = scan.nextInt();
   }
       System.out.println("Would you like to enter book info?(Y/N)");
   String answer=scan.next();
   List<Book> bookList=new ArrayList<>();

   if(answer.equalsIgnoreCase("y")){
      while(answer.equalsIgnoreCase("y")){
         System.out.println("What is the name of the book?");
         String bookName=scan.nextLine();
         scan.nextLine();
         System.out.println("What is genre of the book?");
         String bGenre=scan.nextLine();
         System.out.println("How many pages does book have?");
         int totalPageOfBook=scan.nextInt();
         scan.nextLine();

       //  Book bk=new Book(bookName,bGenre,totalPageOfBook);
       //  bookList.add(bk);

      }
      System.out.println("end of the program");
   }
       System.out.println(new Author1(authorFName,authorLName,country,authorAlive,age,bookList));


    }


}
