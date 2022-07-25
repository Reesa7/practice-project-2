package practiceproject2;


//Import the FileWriter class
import java.io.FileWriter; 

//Import the IOException class for handling errors
import java.io.IOException; 

public class Writefile {
 public static void main(String[] args)
 {
     try {
         FileWriter Writer
             = new FileWriter("myfile.txt");
         Writer.write(
             "File handling in java!!");
         Writer.close();
         System.out.println("Successfully written in file.");
     }
     catch (IOException e) {
         System.out.println("An error has occurred.");
         e.printStackTrace();
     }
 }
}