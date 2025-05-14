//StringBuilder Usage.

package Day7;

public class Activity3 {
    public static void main(String[] args) {
        //task:7 Create a StringBuilder object and append the strings “Hello”, “ ”, and “World!”. Print the final result.
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("Final String: " + sb.toString());

        //task8:use the stringbuilder from task7 to reverse the string and print the reversed version.
        sb.reverse();
        System.out.println("Reversed String: " + sb.toString());

    }
}
