package fileNavigation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Saket.Kumar\\soleraRepo\\ReadMe.txt");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			System.out.println(fis.read());
			int i = fis.read();
			System.out.println(i);
			System.out.println((char)i);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
