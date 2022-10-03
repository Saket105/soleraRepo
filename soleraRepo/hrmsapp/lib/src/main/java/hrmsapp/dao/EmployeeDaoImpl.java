package hrmsapp.dao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Set<Employee> setOfEmployee = new TreeSet<>();

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub

		setOfEmployee.add(employee);
//		System.out.println(employee.getId());

//		#################################By using hashset ##############################################
//		HashSet<Employee> set = new HashSet<>();
//		set.add(employee);
//		System.out.println(employee.getId());
//		#################################By using hashset ##############################################

		return employee;
	}

	@Override
	public Employee getEmpId(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for (Employee emp : setOfEmployee) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		throw new EmployeeNotFoundException("Employee with id " + id + " not found");
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		if(employee.getName()!=null) {
		 setOfEmployee.add(employee);
		return employee;
		}
		throw new EmployeeNotFoundException("Employee not found");

	}

	@Override
	public String deleteEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		for(Employee emp:setOfEmployee) {
			if(emp.getId()==id) {
				setOfEmployee.remove(emp);
				return "Employee with Id "+emp.getId()+" gets deleted";
			}
		}
		throw new EmployeeNotFoundException("Employee with id " + id + " not found");
		
	}

}
