public class Books {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        Book book3 = new Book("Clean Code", "Robert C. Martin", 450.75);
    }
}
class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("Default Constructor:");
        printDetails();
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; 
        System.out.println("Parameterized Constructor (title & author):");
        printDetails();
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized Constructor (all fields):");
        printDetails();
    }
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}