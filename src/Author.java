import java.util.ArrayList;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    public Author(String firstName,String lastName,String country,boolean isAlive, int age, String listOfBooks){

    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
        ArrayList<Book> books=new ArrayList<>();
         public String firstName;
         public String lastName;
         public String country;
         public boolean isAlive;
         public int age;
         public String listOfBooks;


    /*
    Override toString() method here that returns Author object information
     */

    @Override
    public String toString() {
        return "Author{" +
                "books=" + books +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                ", listOfBooks='" + listOfBooks + '\'' +
                '}';
    }
}
