import java.awt.print.Book;
import java.util.List;

public class Author1 {
    /**
     * WORK ON BOOK CLASS FIRST
     * Create a custom constructor that will take 6 args and defines the Author object
     * Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    public Author1(String firstName, String lastName, String country, boolean isAlive, int age, List<Book1> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }

    /*
           Define instance variables here
           NOTE: Books must be defined as a List of Objects of Book class not String
       */
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public int age;
    public List<Book1> books;

     /*
        Override toString() method here that returns Author object information
         */

    @Override
    public String toString() {
        if (isAlive) {
            return "Author1{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", country='" + country + '\'' +
                    ", isAlive=" + isAlive +
                    ", age=" + age +
                    '}';

        }
            return "Author1{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                '}';

    }
}