package serializablePractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Saket");
		
		System.out.println(student);
		
		File file =new File("C:\\Users\\Saket.Kumar\\soleraRepo\\Serial.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			oos.writeObject(student);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
