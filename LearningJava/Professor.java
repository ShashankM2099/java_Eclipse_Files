package LearningJava;

public class Professor {
	private String Name;
	private String deparT;
	private int salary;
	
	@Override
	public String toString() {
		return "Professor [Name=" + Name + ", deparT=" + deparT + ", salary=" + salary + "]";
	}
	public Professor(String name, String deparT, int salary) {
		super();
		this.Name = name;
		this.deparT = deparT;
		this.salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDeparT() {
		return deparT;
	}
	public void setDeparT(String deparT) {
		this.deparT = deparT;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
