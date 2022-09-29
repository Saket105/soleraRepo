package workingwithFile;

import java.io.Serializable;

public class Person1 implements Serializable {
	/**
	 * Generated from Eclipse IDE
	 */
	private static final long serialVersionUID = -5551642649093889857L;
	/**
	 * Persitable fields
	 */
	protected String name = null;
	protected Integer age = null;
	/**
	 * Non-persitable fields
	 */
	protected transient String location = null;

	public Person1() {
	}

	public Person1(String name, Integer age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + " Location: " + location;
	}
}