

class MyStuff {
    // Instance variables (fields)
    String title;
    String author;
    int pages;
    boolean isCheckedOut;

    // Constructor to initialize the Book object
    public MyStuff(String title, String author, int pages, boolean isCheckedOut) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isCheckedOut = isCheckedOut;
    }

    // Method to display the book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + pages);
        System.out.println("Checked Out: " + (isCheckedOut ? "Yes" : "No"));
    }

    // Optional: A method to check out the book
    public void checkOut() {
        isCheckedOut = true;
        System.out.println("The book '" + title + "' has been checked out.");
    }

    // Optional: A method to return the book
    public void returnBook() {
        isCheckedOut = false;
        System.out.println("The book '" + title + "' has been returned.");
    }
}




public class Driver {
    public static void main(String[] args) {
        // Create a new Book object using the constructor
        MyStuff book1 = new MyStuff("1984", "George Orwell", 328, false);
        MyStuff book2 = new MyStuff("To Kill a Mockingbird", "Harper Lee", 281, false);

        // Display the details of the books
        book1.displayDetails();
        book2.displayDetails();

        // Check out the first book
        book1.checkOut();

        // Display updated details of the books
        System.out.println("\nUpdated Details:");
        book1.displayDetails();
        book2.displayDetails();

        // Return the first book
        book1.returnBook();

        // Display the final details
        System.out.println("\nFinal Details:");
        book1.displayDetails();
        book2.displayDetails();
    }
}
