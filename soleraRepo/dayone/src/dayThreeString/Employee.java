package dayThreeString;

import java.util.Objects;

public class Employee {
	private int empId;
	private String fName;
	private String departement;
	private String lastname;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String fName, String departement, String lastname) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.departement = departement;
		this.lastname = lastname;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(departement, empId, fName, lastname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		
		/*
		 * return Objects.equals(departement, other.departement) && empId == other.empId
		 * && Objects.equals(fName, other.fName) && Objects.equals(lastname,
		 * other.lastname);
		 */
		return (this.getLastname()==other.getfName());
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", departement=" + departement + ", lastname="
				+ lastname + "]";
	}
	
	
}
