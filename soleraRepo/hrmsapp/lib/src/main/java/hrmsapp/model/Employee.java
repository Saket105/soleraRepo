package hrmsapp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Employee {
	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private double salary;
	private Address address;
	
	
}
