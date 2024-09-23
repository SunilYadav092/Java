// Copy by Assigning Values:
class Book01 {
    String title;
    String author;

    // Constructor
    public Book01(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
    public static void main(String[] args) {
        Book01 book1 = new Book01("The Hobbit", "J.R.R. Tolkien");
        Book01 book2 = new Book01("", "");  // Empty book to assign values later

        // Manually copying values from book1 to book2
        book2.title = book1.title;
        book2.author = book1.author;

        book1.displayInfo();
        book2.displayInfo();
    }
}
