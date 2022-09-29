package assignment1;

public class Test implements Outer{
	public static void main(String[] args) {
		Employee one = new Employee();
		 one.employeeId = 101;
		 Employee two = new Employee();
		 two.employeeId = 101;
		 if (one.equals(two)) System.out.println("Success");
		 else System.out.println("Failure");
		 } 
	
}
