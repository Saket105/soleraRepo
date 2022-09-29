package helloworld;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private LocalDate dob;
	private Address address; //Has-A relation ship
	
	
	
	public Employee(int empId, String name, double salary, LocalDate dob, Address address) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.dob = dob;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dob=" + dob + ", address="
				+ address + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
