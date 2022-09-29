package assignment3;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] student = new Student[5];
		student[0] = new Student(1,"Saket",7.6);
		student[1] = new Student(2,"Sam",8.2);
		student[2] = new Student(3,"Ankit",6.5);
		student[3] = new Student(4,"Shivam",8.0);
		student[4] = new Student(5,"Ritik",7.8);
		
		for(Student s:student) {
			System.out.println(s);
		}
		
	}

}
