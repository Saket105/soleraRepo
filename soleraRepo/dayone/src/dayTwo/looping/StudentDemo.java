package dayTwo.looping;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		Student[] studentArr = new Student[5];
		
		studentArr[0] = new Student("Saket","Bokaro");
		studentArr[1] = new Student("Sourabh","Munger");
		studentArr[2] = new Student("Aman","Dhanbad");
		studentArr[3] = new Student("Ankit","Bangalore");
		studentArr[4] = new Student();
		
		int l = studentArr.length;
		
		for(int index=0;index<l;index++) {
			System.out.println(studentArr[index]);
		}
	}

}
