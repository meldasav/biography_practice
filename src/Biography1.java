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
   List<Book1> bookList=new ArrayList<>();
   System.out.println("What is your favorite author’s first name?");
   String firstName= scan.nextLine();

   System.out.println("What is your favorite author’s last name?");
   String lastName=scan.nextLine();

   System.out.println("Where is your favorite author is from?");
   String country=scan.nextLine();

   String str="";
   boolean isAlive=false;
     System.out.println("Is your favorite author is alive? (Y/N)");
      str=scan.nextLine();
    if(str.toUpperCase().startsWith("Y")) isAlive=true;

   int age=MIN_VALUE;
   if(isAlive) {
      System.out.println("How old is your author?");
      age = scan.nextInt();
   }

     Author1 myAuthor = new Author1(firstName, lastName, country, isAlive,age,bookList);
     String results;
     do{
         System.out.println("Would you like to enter book info? (Y/N)");
         results=scan.next();


         if((results.toUpperCase().startsWith("Y"))){
         System.out.println("What is the name of the book?");
         String name=scan.nextLine();
         scan.nextLine();
         System.out.println("What is genre of the book?");
         String genre=scan.nextLine();
         System.out.println("How many pages does book have?");
         int totalPage=scan.nextInt();


         Book1 book1=new Book1(name,genre,totalPage);
         bookList.add(book1);

      }

      } while(results.toUpperCase().startsWith("Y"));
            System.out.println(myAuthor);

       for (Book1 book1 :bookList){
           System.out.println(book1);
       }


    }


}
