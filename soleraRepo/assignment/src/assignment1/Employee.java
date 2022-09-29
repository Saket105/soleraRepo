package assignment1;

public class Employee {
	public int employeeId;
	public String firstName, lastName;
	public int yearStarted;

	@Override public int hashCode() {
 return employeeId;
 }

	public boolean equals(Employee e) {
 return this.employeeId == e.employeeId;
 }
}
