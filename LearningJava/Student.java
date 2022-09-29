package LearningJava;

public class Student extends Professor {
	private String studentName;
	private int studentAge;
	private String studentMajor;
	private int studentGPA;
	
	
	public Student(String name, String deparT, int salary, String studentName, int studentAge, String studentMajor,
			int studentGPA) {
		super(name, deparT, salary);
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMajor = studentMajor;
		this.studentGPA = studentGPA;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentMajor() {
		return studentMajor;
	}
	public void setStudentMajor(String studentMajor) {
		this.studentMajor = studentMajor;
	}
	public int getStudentGPA() {
		return studentGPA;
	}
	public void setStudentGPA(int studentGPA) {
		this.studentGPA = studentGPA;
	}
	
}
