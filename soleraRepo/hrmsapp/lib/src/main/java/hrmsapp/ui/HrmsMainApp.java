package hrmsapp.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hrmsapp.model.Address;
import hrmsapp.model.Employee;

public class HrmsMainApp {
	public static void main(String[] args) {
		Address ad = new Address();
		Employee emp = new Employee(1,"Saket",LocalDate.now(),50000.0,ad);
		Employee emp1 = new Employee(2,"Sam",LocalDate.now(),450000.0,ad);
		Employee emp2 = new Employee(3,"Abcd",LocalDate.now(),50000.0,ad);
		
		List<Employee> list = new ArrayList<>();
		list.add(emp2);
		list.add(emp1);
		list.add(emp);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
	}
}
