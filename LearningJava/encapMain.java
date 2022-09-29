package LearningJava;

public class encapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsulationMethod cust1 = new encapsulationMethod();
		cust1.setFirstName("Shashank");
		cust1.setLastName("Mondrati");
		System.out.println(String.format("%s with Firstname: %s with lastName", cust1.getFirstName(), cust1.getLastName()));
		
	}

}
