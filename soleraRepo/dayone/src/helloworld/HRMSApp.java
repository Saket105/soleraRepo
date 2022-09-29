package helloworld;

import java.time.LocalDate;

public class HRMSApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee emp = new Employee();
		Address add = new Address();
		
		add.setAddressId(1);
		add.setCity("Bokaro");
		add.setDistrict("Bokaro");
		add.setState("Jharkhand");
		
//		emp.setName("Saket");
//		emp.setEmpId(1);
//		emp.setDob(LocalDate.now());
//		emp.setSalary(5000);
//		emp.setAddress(add);
		
//		System.out.println(emp);
//		System.out.println(emp.getName());
//		System.out.println(add.getCity());
		Employee emp = new Employee(2, "Saket", 55000, LocalDate.now(), add);
		Employee emp2 = new Employee(3, "Sam", 50000, LocalDate.now(), add);
		
		System.out.println(emp);
		System.out.println(emp2);
		
		
		displayInfo();
	}
	
	void display() {
		System.out.println("Display");
	}
	
	static void displayInfo() {
		System.out.println("Display with static");
	}

}
