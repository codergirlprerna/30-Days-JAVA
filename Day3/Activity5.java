//Short-Circuit Behaviour
package Day3;
public class Activity5{
    public static void main(String[] args) {
        //Task 11: Demonstrate short-circuit behavior by checking if a variable is not null before accessing its property.
        String name=null;
        if(name !=null && name.length()>0){
            System.out.println("Name is not empty");
        }else{
            System.out.println("Name is Empty");
        }

        //task12: Task 12: Use && and || with expressions that involve method calls or operations to show short-circuiting in action
        System.out.println("Example with && (AND):");
        if (false && checkSecondCondition()) {
            System.out.println("Both conditions are true");
        } else {
            System.out.println("Short-circuited AND: second condition not evaluated");
        }

        System.out.println("\nExample with || (OR):");
        if (true || checkSecondCondition()) {
            System.out.println("Short-circuited OR: second condition not evaluated");
        } else {
            System.out.println("Both conditions are false");
        }
    }

    public static boolean checkSecondCondition() {
        System.out.println("checkSecondCondition() method called");
        return true;
    }
}