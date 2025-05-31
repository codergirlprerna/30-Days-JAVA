package Day20;

public class ValidationUtils {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Check if a string contains only digits
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    // Validate email format (simple version)
    public static boolean isValidEmail(String email) {
        return email != null && email.matches("^\\S+@\\S+\\.\\S+$");
    }

    // Check if age is within a valid range
    public static boolean isValidAge(int age) {
        return age >= 0 && age <= 120;
    }

}
