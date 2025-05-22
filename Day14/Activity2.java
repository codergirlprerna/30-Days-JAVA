//BufferReader and FileExistance
package Day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Activity2 {
    public static void main(String[] args) {
       // Task 5: Use BufferedReader to read lines from the file line by line and print them.
       //Task 6: Use File.exists() to check if a specific file exists and print a message accordingly.
       //Task 7: Programmatically delete a file and confirm deletion.
//task6:
    File file = new File("output.txt");
    if(file.exists()){
        System.out.println("The file 'output.txt; exists");

       try{
       BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
       String Line;
       while((Line=reader.readLine())!=null){
        System.out.println(Line);
       }
       reader.close();
    }catch(IOException e){
        System.out.println("An error occured while reading the line");
        e.printStackTrace();
    }

    
    if(file.delete()){
        System.out.println("\n File 'output.txt' deleted succesfully");
    }else{
        System.out.println("Failed to delete this file");
    }
}else{
    System.out.println("The file 'output.txt' does not exist");
}
    }
}
