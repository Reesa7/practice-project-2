package practiceproject2;

//Import the File class
import java.io.File; 

public class Deletefile {
 public static void main(String[] args)
 {
     File Obj = new File("C:\\Users\\reesa\\reesa.txt");
     if (Obj.delete()) {
         System.out.println("The deleted file is : "
                            + Obj.getName());
     }
     else {
         System.out.println(
             "Failed in deleting the file.");
     }
 }
}
