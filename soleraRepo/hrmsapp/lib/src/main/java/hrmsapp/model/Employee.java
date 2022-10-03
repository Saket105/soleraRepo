package hrmsapp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString


public class Employee implements Comparable{
	private int id;
	private String name;
	private LocalDate dateOfBirth;
	private double salary;
	private Address address;
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(this.id==((Employee)o).id) {
			return 0;
		}else if(this.id<((Employee)o).id){
			return 1;
		}else {
			return -1;
		}
	}
	
	
}
