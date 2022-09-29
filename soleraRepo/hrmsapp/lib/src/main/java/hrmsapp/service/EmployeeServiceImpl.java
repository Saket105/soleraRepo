package hrmsapp.service;

import hrmsapp.dao.EmployeeDao;
import hrmsapp.dao.EmployeeDaoImpl;
import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		Employee emp = employeeDao.addEmployee(employee);
		return emp;
	}

	@Override
	public Employee getEmpId(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDaoImpl();

		return employeeDao.getEmpId(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDaoImpl();

		return employeeDao.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(int id) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		EmployeeDao employeeDao = new EmployeeDaoImpl();

		return employeeDao.deleteEmployee(id);
	}

}
