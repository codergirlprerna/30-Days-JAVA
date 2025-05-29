//Optional,predicate and function
package Day17;

import java.util.Optional;

public class Activity3 {
    public static void main(String[] args) {
        //Task 9: Create an Optional<String>, check if value is present, and provide a default using orElse().
        Optional <String> name = Optional.of("John");
        Optional <String> emptyName = Optional.empty();

        if(name.isPresent()){
            System.out.println("Name is: " + name.get());
        }else{
            System.out.println("Name is not present");
        }
        String defaultName = emptyName.orElse("Default Name");
        System.out.println("Name from empty Optional: " + defaultName);



    }
}
