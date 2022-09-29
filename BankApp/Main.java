package BankApp;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customers' Name: ");
		String customer_Name = sc.next();
		System.out.println("Enter Customer Account Number: ");
		String customer_ID = sc.next();
		BankAccount customer1 = new BankAccount(customer_Name, customer_ID);
		customer1.displayMenu();
		
		sc.close();
	}

}
