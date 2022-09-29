package dayTwo;

import java.time.LocalDate;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new EmployeeImpl();
		EmployeeImpl employee1 = new EmployeeImpl();
		String result = employee.emp("Saket");
		LocalDate date = employee.doj(LocalDate.now());
		
		employee1.displayName();
		
		System.out.println(result);
		System.out.println(date);
	}
}
