package hrmsapp.dao;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public interface EmployeeDao {
//	Create Data
	public Employee addEmployee(Employee employee);

//	Retrive 
	public Employee getEmpId(int id) throws EmployeeNotFoundException;

//	Update
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;

//	Delete 
	public String deleteEmployee(int id) throws EmployeeNotFoundException;
}
