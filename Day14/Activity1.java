//File Handling:Basic File operation
package Day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Activity1 {
    public static void main(String[] args) {
        //Task 1: Write a program to create and write "Hello, world!" to a file.
        //Task 2: Read and print the contents of the file created in Task 1.
        //Task 3: Append additional text to the file without overwriting existing content.
        //Task 4: Count and print the number of words in the file.
        int wordCount = 0;
        try{
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello World!");
            writer.close();
            System.out.println("Successfully wrote to a file");
        }catch(IOException e){
            System.out.println("An error occured while writing to a file");
            e.printStackTrace();
        }
        try{
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            String Line;
            while((Line=br.readLine())!=null){
                System.out.println(Line);
            }
            br.close();
            fr.close();

        }catch(IOException e){
            System.out.println("An error occured while reading this file");
            e.printStackTrace();
        }
        try{
            FileWriter writer = new FileWriter("output.txt",true);
            writer.write("\n This is an additional text being appended ");
            writer.close();
            System.out.println("Text successfully appended to file");
        }catch(IOException e){
            System.out.println("An error occur while appending to a file");
            e.printStackTrace();
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String Line;


            while((Line=reader.readLine())!=null){
                String[] words = Line.trim().split("\\s+");

                if(!Line.trim().isEmpty()){
                    wordCount+=words.length;
                }
            }
            reader.close();
            System.out.println("Total number of words in the file: " + wordCount);
        }catch(IOException e){
            System.out.println("An error occured while reading this file");
            e.printStackTrace();
        }
        
    }
}
