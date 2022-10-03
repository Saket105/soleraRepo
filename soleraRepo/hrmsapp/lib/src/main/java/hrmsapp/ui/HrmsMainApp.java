package hrmsapp.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import hrmsapp.comparator.SalaryComparator;
import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Address;
import hrmsapp.model.Employee;
import hrmsapp.service.EmployeeService;
import hrmsapp.service.EmployeeServiceImpl;

public class HrmsMainApp {
	public static void main(String[] args) {
		Address ad = new Address(1, 301, "BKSC", "Jharkhand", "India", "Ramdih More", 827009l);
		Employee emp = new Employee(1, "Saket", LocalDate.now(), 50000.0, ad);
		Employee emp1 = new Employee(2, "Sam", LocalDate.now(), 450000.0, ad);
		Employee emp2 = new Employee(3, "Abcd", LocalDate.now(), 50000.0, ad);

		EmployeeService employeeService = new EmployeeServiceImpl();
//		########################## For Adding Data ########################################
		List<Employee> listofEMployee = new ArrayList<>();
		listofEMployee.add(employeeService.addEmployee(emp));
		listofEMployee.add(employeeService.addEmployee(emp1));
		listofEMployee.add(employeeService.addEmployee(emp2));
//		System.out.println(listofEMployee);
//		########################## For Adding Data ########################################
		
		

		try {
//			########################## Getting ID ##########################################
			Employee e = employeeService.getEmpId(1);
			System.out.println(e);
//			########################## Getting ID ##########################################
			

//			########################## Deleting employee data with ID ##########################################

			String e2 = employeeService.deleteEmployee(1);
			System.out.println(e2);
			System.out.println(listofEMployee);
			
//			########################## Deleting employee data with ID ##########################################
			
			
			
//			########################## Update employee data with ID ##########################################
			
			Employee updateEmp = new Employee(4,"Shivam",LocalDate.now(),37500.0,ad);
			listofEMployee.add(employeeService.addEmployee(updateEmp));
			System.out.println(listofEMployee);
			
//			########################## Update employee data with ID ##########################################



		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println(e1.getMessage());
		}
		
		System.out.println("########################################");
		Collections.sort(listofEMployee,new SalaryComparator());
		System.out.println(listofEMployee);
		
		Collections.sort(listofEMployee,Comparator.comparing(Employee::getSalary));
		listofEMployee.forEach(System.out::println);

		/*
		 * List<Employee> list = new ArrayList<>(); list.add(emp); list.add(emp1);
		 * list.add(emp2);
		 * 
		 * for (Iterator iterator = list.iterator(); iterator.hasNext();) { Employee
		 * employee = (Employee) iterator.next(); System.out.println(employee); }
		 */

	}
}
