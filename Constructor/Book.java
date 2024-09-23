//Copy by Constructor (Custom Copy Constructor)
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book(book1);  // Copying using the copy constructor

        book1.displayInfo();
        book2.displayInfo();
    }
}
