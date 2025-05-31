package Day20;

public class UserRegistration {
    public static void main(String[] args) {
         String name = "Alice";
        String email = "alice@example.com";
        String ageStr = "25";

        if (ValidationUtils.isNullOrEmpty(name)) {
            System.out.println("Name cannot be empty");
        } else if (!ValidationUtils.isValidEmail(email)) {
            System.out.println("Invalid email format");
        } else if (!ValidationUtils.isNumeric(ageStr)) {
            System.out.println("Age must be numeric");
        } else {
            int age = Integer.parseInt(ageStr);
            if (!ValidationUtils.isValidAge(age)) {
                System.out.println("Invalid age");
            } else {
                System.out.println("All validations passed! Registration successful.");
            }
        }
    }
}
