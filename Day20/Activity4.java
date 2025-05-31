package Day20;
class Student{
   private String name;
   private int marks;
   Student(String name,int marks){
      this.name=name;
      this.marks=marks;
   }
   public String getName(){
      return name;
   }
   public int getMarks(){
      return marks;
   }
}
/** 
 * @author Prerna
* @version 1.0
*/
public class Activity4 {
    private Activity4() {
        throw new UnsupportedOperationException("Utility class");
    }
   public static void main(String[] args) {
    //Task 16: Refactor a large method into smaller, readable methods using single responsibility principle.
   //Task 17: Replace nested if-else chains with early returns or switch statements.
   //Task 18: Use method overloading to simplify repeated logic with different parameter types.
   //Task 19: Add JavaDoc comments to all methods in a utility class.
   //Task 20: Rename variables and methods in an existing class to follow Java naming conventions and improve readability.

   Student student1 = new Student("aman", 70);
   Student student2 = new Student(null, 90);
   Student student3 = new Student("abhi", 80);
   System.out.println("=== Before Refracting ===");
   processStudentBefore(student1);
   processStudentBefore(student2);

   System.out.println("\n=== After Refracting === ");
   Activity4 app = new Activity4();
   app.processStudentAfter(student1);
   app.processStudentAfter(student3);

   System.out.println("------- TASK 16 DONE --------");
   System.out.println("=== Before Refracting ===");
   processGradeBefore("A");
   processGradeBefore("B");
   processGradeBefore("Z");

   System.out.println("\n=== After Refracting ===");
   processGradeAfter("A");
   processGradeAfter("B");
   processGradeAfter("Z");
   System.out.println("------- TASK 17 DONE --------");
   System.out.println("Addition of type int: " + add(2,4));
   System.out.println("Addition of type double: " + addDouble(4.0, 18.0));
   System.out.println("Addition of type long: " + addLong(34l,45l));
   System.out.println("------- TASK 18 DONE --------");
   System.out.println("Add: " + Activity4.adds(5, 6));
   System.out.println("Subtract: " + Activity4.subtract(7,3 ));
   System.out.println("Multiply: " + Activity4.multiply(3, 8));
   System.out.println("Division: " + Activity4.divide(5, 1));

   



   } 
   public static void processStudentBefore(Student student){
      //validate student data
      if(student.getName() == null || student.getMarks()<0){
         System.out.println("Invalid data");
         return;
      }
      //calculate record
      int marks = student.getMarks();
      String grade;
      if(marks>=90) grade = "A";
      else if(marks>=75) grade = "B";
      else if(marks>=60) grade = "C";
      else grade = "D";
   
   //print report
   System.out.println("Student: " + student.getName());
   System.out.println("Marks: " + marks);
   System.out.println("Grade: " + grade);
   System.out.println("-----------------------");
   }

   //After refracting using srp
   public static void processStudentAfter(Student student){
      if(!isValidStudent(student)){
         System.out.println("Invalid student data");
         return;
      }
      String grade = calculateGrade(student.getMarks());
      printReport(student,grade);
   }
   public static boolean isValidStudent(Student student){
      return student.getName() != null && student.getMarks()>=0;
   }
   public static String calculateGrade(int marks){
      if(marks>=90) return "A";
      if(marks>=75) return "B";
      if(marks>=60) return "C";
      return "D";
   }
   public static void printReport(Student student,String grade){
      System.out.println("Student: " + student.getName());
      System.out.println("Student: " + student.getMarks());
      System.out.println("Grade: " + grade);
      System.out.println("-----------------------------");
   }
   public static void processGradeBefore(String grade) {
        if (grade.equals("A")) {
            System.out.println("Excellent performance");
        } else {
            if (grade.equals("B")) {
                System.out.println("Good performance");
            } else {
                if (grade.equals("C")) {
                    System.out.println("Average performance");
                } else {
                    if (grade.equals("D")) {
                        System.out.println("Poor performance");
                    } else {
                        System.out.println("Invalid grade");
                    }
                }
            }
        }
      }
public static void processGradeAfter(String grade){
   switch(grade){
      case "A":
           System.out.println("Excellent Performace");
           return;
      case "B":
           System.out.println("Good Performance");
           return;
      case "C":
           System.out.println("Average Performance");
           return;
      case "D":
           System.out.println("Poor Performance");
           return;
      default:
           System.out.println("Invalid Grade");

   }
}
   
public static int add(int a,int b){
   return a+b;
}
public static double addDouble(double a,double b){
   return a+b;
}
public static long addLong(long a,long b){
   return a+b;
}
    /**
     * Adds two integers and returns their sum.
     *
     * @param a The first number
     * @param b The second number
     * @return The sum of a and b
     */
    public static int adds(int a, int b) {
        return a + b;
    }
/**
     * Subtracts the second number from the first.
     *
     * @param a The number to subtract from
     * @param b The number to subtract
     * @return The result of a - b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }
/**
     * Multiplies two integers.
     *
     * @param a The first number
     * @param b The second number
     * @return The product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
/**
     * Divides one number by another.
     *
     * @param a The numerator
     * @param b The denominator
     * @return The result of a / b
     * @throws ArithmeticException If b is zero
     */
    public static int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}

      
   
