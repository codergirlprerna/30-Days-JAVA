package Day12;
interface Printable{
    public void print();
}
interface Savable{
    public void save();
}

class Book implements Printable{
    @Override
    public void print(){
        System.out.println("Hello from Book class");

    }

}
class Document implements Printable{
    @Override
    public void print(){
        System.out.println("Hello from Document class");
    }
}
class Report implements Printable,Savable{
    @Override
    public void print(){
        System.out.println("Hello from Report class");
    }
    @Override
    public void save(){
        System.out.println("Hello from Report class");
    }

}
public class Activity2 {
    public static void printAnything(Printable p){
        p.print();
    }
    public static void main(String[] args) {
        //Task 5: Create an interface Printable with a method print().
        //Task 6: Implement Printable in classes Document and Book, and override print() with custom messages.
        //Task 7: Create another interface Savable with a method save().
        //Task 8: Implement both Printable and Savable in a class Report, and demonstrate calling both methods.
        //Task 9: Write a method printAnything(Printable p) and call it with Document, Book, and Report objects.
        Book book = new Book();
        Document document = new Document();
        Report report = new Report();
        report.print();
        report.save();
        printAnything(book);
        printAnything(document);
        printAnything(report);



    }
}
