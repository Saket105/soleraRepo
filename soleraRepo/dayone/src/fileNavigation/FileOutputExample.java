package fileNavigation;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "Good Morning everyone hope you are doing great!";
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Saket.Kumar\\soleraRepo\\Output.txt");
			fos.write(68);
			fos.write(65);
			byte barr[] = word.getBytes();
			fos.write(barr);
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
