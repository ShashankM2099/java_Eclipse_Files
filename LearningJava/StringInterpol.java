package LearningJava;

public class StringInterpol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Shashank";
		String Address = "718 MingleWood Dr";
		int age = 23;
		int zCode = 28262;
		String city= "CLT";
		String state= "NC";
		System.out.println(String.format("Details: Name: %s, Address: %s, Age: %d, ZipCode: %d, City: %s, State: %s ", name, Address, age, zCode, city, state));
	}	

}
