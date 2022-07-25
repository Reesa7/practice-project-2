package practiceproject2;

import java.io.FileInputStream;

public class Reading_file_demo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\reesa\\reesa.txt");
			int i =fis.read();
			System.out.println((char)i);
			fis.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
