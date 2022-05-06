package entities;

public class Employee {
	//Attributes
	private int id;
	private String name;
	private double salary;
	
	//Constructors
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(double salary) {
		this.salary += salary;
	}
}
