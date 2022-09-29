package dayTwo;

import java.time.LocalDate;

public class EmployeeImpl implements Employee{

	static String COMPANY = "SOLERA";
	@Override
	public String emp(String name) {
		// TODO Auto-generated method stub
		
		return name;
	}
	
	public void displayName() {
		System.out.println(COMPANY);
	}

	@Override
	public LocalDate doj(LocalDate date) {
		// TODO Auto-generated method stub
		
		return date;
	}
	
	
}
