package Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*class Employee{
    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}
*/
/* 
@FunctionalInterface
interface StringOperation{
    String operate(String s);
}*/

public class Activity6 {
    public static String getNameById(int id){
        if(id == 1) return "Aman";
        return null;

    }
        public static String findUserNameById(int id) {
        if (id == 1) return "Prerna";
        return null; // For other IDs, return null
    }

    public static void main(String[] args) {
        //Task 26: Use a lambda expression to sort a list of custom objects (e.g., Employee by salary).
       //Task 27: Use Stream API to filter, map, and collect results from a list.
      //Task 28: Demonstrate flatMap() to flatten a nested list of lists.
      //Task 29: Create and use a custom functional interface with a lambda.
     //Task 30: Use Optional to handle potentially null values in a safe way.
     /* 
     List<Employee>employees = new ArrayList<>();
     employees.add(new Employee("aman", 50000));

     employees.add(new Employee("sunil", 900000));
     employees.add(new Employee("abhi", 65000));
     System.out.println("Before Sorting");
     employees.forEach(System.out::println);
     employees.sort((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
     System.out.println("\n After sorting by Salary (ascending):");
     employees.forEach(System.out::println);

     List<String> highEarner = employees.stream()
     .filter(emp->emp.getSalary()>50000)
     .map(Employee::getName)
     .collect(Collectors.toList());

     System.out.println("Employee with salary > 50000:");
     highEarner.forEach(System.out::println);*/
     /* 
     List<List<String>> nestedList= Arrays.asList(
        Arrays.asList("Aman","priya"),
        Arrays.asList("Raj","Sneha"),
        Arrays.asList("Neha","Karan")
     );
     System.out.println("Nested List");
     nestedList.forEach(System.out::println);
     List<String> flatList = nestedList.stream()
     .flatMap(List::stream)
     .collect(Collectors.toList());

     System.out.println("\n Flattened List:");
     flatList.forEach(System.out::println);
*/
/* 
     StringOperation toUpperCase = str->str.toUpperCase();
     StringOperation reverse = str-> new StringBuilder(str).reverse().toString();

     String name="Aman";
     System.out.println("Original String: " + name);
     System.out.println("Uppercase: " + toUpperCase.operate(name));
     System.out.println("Reversed: " + reverse.operate(name));
     */
/* 
     Optional<String> nameOptional = Optional.ofNullable(getNameById(1));
     nameOptional.ifPresent(name -> System.out.println("Name: " + name));

     Optional<String> missingValue = Optional.ofNullable(getNameById(99));
     System.out.println("Name: " + missingValue.orElse("Unknown"));

     if(missingValue.isPresent()){
        System.out.println("Length: " + missingValue.get().length());
     }else{
        System.out.println("No name is found with ID 99");
     }
*/
  Optional<String> user1 = Optional.ofNullable(findUserNameById(1));
  Optional<String> user2 = Optional.ofNullable(findUserNameById(99));
  user1.ifPresent(name -> System.out.println("User 1: " + name));
  System.out.println("User 2: " + user2.orElse("Unknown User"));
  String upperName = user1.map(String::toUpperCase).orElse("No Name");
  System.out.println("User 1 in uppercase: " + upperName);
  if (user2.isPresent()) {
            System.out.println("User 2 length: " + user2.get().length());
        } else {
            System.out.println("User 2 not found.");
        }





    }
}
