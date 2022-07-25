package practiceproject2;
import java.io.*;
import java.io.FileOutputStream;

public class Filehandlingdemo {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\reesa\\reesa.txt");
			fout.write(102);
			fout.close();
			System.out.println("success");
			}
       catch(Exception e) {
    	   e.printStackTrace();
       }
	}

}
