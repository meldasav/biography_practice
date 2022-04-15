public class Book1 {
    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
     Create a custom constructor that will take 3 args and defines the Book object
     Define Book class fields as name, genre, totalPage
     */
    //Create 3 args custom constructor here
     public Book1(String bookName,String bGenre,int totalPageOfBook){
     this.name=bookName;
     this.genre=bGenre;
     this.totalPage=totalPageOfBook;
    }


    //Define instance variables here
    public String name;
    public String genre;
    public int totalPage;

    /*
        Override toString() method that returns Book object information
     */

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}