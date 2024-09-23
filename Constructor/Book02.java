// Copy by clone() Method:
class Book02 implements Cloneable {
    String title;
    String author;

    // Constructor
    public Book02(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Overriding clone() method for shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
    public static void main(String[] args) {
        try {
            Book02 book1 = new Book02("To Kill a Mockingbird", "Harper Lee");
            Book02 book2 = (Book02) book1.clone();  // Cloning book1

            book1.displayInfo();
            book2.displayInfo();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
