public class Book {
    private static long idCount=0;
    long id;
    String title;
    String description;
    final String author;
    String isbn;
    int printYear;
    boolean readAlready;

    private Book(String title, String description, String author, String isbn, int printYear) {
        this.id = idCount++;
        this.title = title;
        this.description = description;
        this.author = author;
        this.isbn = isbn;
        this.printYear = printYear;
    }

    public static void create(String title, String description, String author, String isbn, int printYear){
        new Book(title,  description, author, isbn, printYear);

    }

    public void read(){
        if (!readAlready) readAlready = true;
    }

    public void update(String title, String description, String isbn, int printYear){
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.printYear = printYear;
        this.readAlready = false;

    }

    public void delete(){

    }
}
