//Array of Objects

package Day6;

public class Activity4 {
    static class Book{
        String title;
        String author;
    
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    void printDetails(){
        System.out.println("Title: " + title + ",Author " + author);
    }
}
     static void printBooksByAuthor(Book[] books, String authorName) {
        System.out.println("Books by " + authorName + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(authorName)) {
                book.printDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by " + authorName);
        }
    
}
    
    public static void main(String[] args) {
        //Task 8: Create a Book class with fields: title and author. Create an array of 3 Book objects, store values, and print their details
        Book[] books = new Book[4];
        books[0]=new Book("Atomic Habits", "James Keller");
        books[1]=new Book("Think Like a Monk", "Jay Shetty");
        books[2]=new Book("You can't hurt me ", "David Goggins");
        books[3]=new Book("Wings of Fire", "Jay Shetty");

        for(int i=0;i<books.length;i++){
            books[i].printDetails();
        }

        //task 9: Write a method that receives an array of Book objects and prints only the books by a given author.
        printBooksByAuthor(books, "Jay Shetty");



    }
}
