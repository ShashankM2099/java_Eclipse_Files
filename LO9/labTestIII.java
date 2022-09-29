/*
 * Program Name : Lab Test III
 * 
 * author : [Shashank Mondrati]
 * version @ [4/28/2020]
 * Lab Section : ITSC-1212-003
 * Program : This program writes a code for a pet store to keep track of their pets. 
 * In other words this program deals with records of data including customers’ name, pets name and the type of pet. 
 * There will be two parts to in this code.
 * ### Part I: Has 4 options and are looped: 
 * 
 * >>Option 1 : Add new customer record ( each record includes customer’s name, pet name, type)
 * >>Option 2: Display: existing customers :
 * >>Option 3: Search records: explained in another part in this program
 * >>Option 4: When the user chooses to exit:
 * 
 * ### Part II: When user decides to choose option 3 from part 1 another menu with 4 options appear.
 * 
 * >>Option 1: Searching for the customer : This will ask the user to enter a customer’s name. 
 * Searching through the array, and if found, displays the customer’s name, pets name and type.
 *  If not found the program displays “ Unable to find customer with that name”
 * >> Option 2: Search for Pet: Kind of  Similar to option 1, however the search is based on pet name rather than the customer’s name.
 * >> Option 3: Pet Type Counter: Asks the user to enter a pet type. 
 *  This program will then search through the pet type, and keeps track of how many pets there are with the inputted type.
 *   After searching through the entire array, display the ## of pets with the specified type.
 * >>Option 4: The usual exit button. 
 *   When the user decides to quit from records option, they are redirected to main menu to proceed with their choosings.
 */
package LO9;
import java.util.*; // imported scanner and arrayList and arrays
public class labTestIII {
	
	private static Scanner scanner = new Scanner(System.in); // scanner variable scanner
	
	private static int maxCustomerRecords = 10; // maxCustomer number of records allowed
	
	private static ArrayList<String[]>  customers = new ArrayList<String[]>(maxCustomerRecords-1); // arrayList for customers which consist of arrays
																									// with customer name at index 0, pets name at 1 and type at 2.
	public static void main(String[] args) { // main method
		System.out.println("---- WELCOME TO PET STORE ----");
		while(true) { //while loop
			int option = mainMenu(); // option for main menu
			if(option == 4) { // if statement
				exit();
				break; // break tag
			} else if (option > 4) { // else if statement
				System.out.println("Please enter correct option 1-4");
			} else { // else statement
				switch(option) { // switch case
				case 1: { // case 1
					addNewCustomer(); // method call back
					break; // break tag
				}
				case 2: { // case 2
					displayCustomers(); // method call back
					break;
				}
				case 3: { // case 3
					searchRecords(); // method call back
					break;
				}
			}
			}
		}

	}

	private static void searchRecords() { // searching for records method
		
		while(true) { // while loop is true
			System.out.println("SEARCH MENU \n"
					+ "Please select from the below option \n" // menu
					+ "1. Search for the customer \n"
					+ "2. Search for Pet \n"
					+ "3. Pet Type Counter \n"
					+ "4. Exit \n");
			int option = scanner.nextInt(); // option to scanner
			if(option == 4) {  // if option is 4
				exitSearchOption(); // calls back to exit method
				break; // break tag
			} else if (option > 4) {
				System.out.println("Enter Correct Options 1-4");
				continue; // continuing the loop
			} else {
				switch (option) { // another switch case
				case 1: { // case 1
					searchForCustomer(); // searching for customer method call back
					break;
				}
				case 2: { //case 2
						searchForPet();	 // searching for pets method call back
					break;
				}
				case 3: {
						petTypeCounter(); // pet type counter method call back
					break; // break tag
				}
			}
			}
		}
	}

	private static void exitSearchOption() { // exit option method
		System.out.println("EXITING SEARCH MENU"); // its just displays a txt msg.
		
	}

	private static void petTypeCounter() { // pet type counter method
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter Pet Type to find the total type count ");
		String petType = scanner.nextLine();
		int petTypeCounter = 0; // starting the counter with 0
		for(String[] customerRecord : customers) { // for loop
			if(customerRecord[2].equals(petType)) { // if statement using an array
				petTypeCounter++;
			}
		}
		if(petTypeCounter> 0) { // if statement > 0
			System.out.println("Found Pet Type "+ petType + " "+ petTypeCounter + " number of times");
		} else { // else statement
			System.out.println("Unable to find any Pet Type matching "+ petType);
		}
		
	}

	private static void searchForPet() { // searching for pet method call back
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter Pet's Name ");
		String petName = scanner.nextLine();
		Boolean customerNotFound = true; // declaring a boolean to be true
		for(String[] customerRecord : customers) { // foreach loop.. tried it and it worked !!!!
			if(customerRecord[1].equals(petName)) { // if statement
				System.out.println("Customer Name: "+customerRecord[0] + "\n"
						+ "Pet Name: "+customerRecord[1] + "\n"
						+ "Pet Type: "+customerRecord[2] + "\n");
				customerNotFound = false; // boolean is now FALSE
			}
		}
		if(customerNotFound) { // if statement
			System.out.println("Unable to find Pet with name ");
		}
		
	}

	private static void searchForCustomer() {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter Customer's Name ");
		String customerName = scanner.nextLine();
		Boolean customerNotFound = true;
		for(String[] customerRecord : customers) {
			if(customerRecord[0].equals(customerName)) {
				System.out.println("Customer Name: "+customerRecord[0] + "\n"
						+ "Pet Name: "+customerRecord[1] + "\n"
						+ "Pet Type: "+customerRecord[2] + "\n");
				customerNotFound = false;
			}
		}
		if(customerNotFound) {
			System.out.println("Unable to find customer with name "+customerName);
		}
	}

	private static void displayCustomers() {
		System.out.println("BELOW ARE THE EXISTING CUSTOMERS");
		for(int i=0;i<customers.size();i++) {
			System.out.println(i+1 + ". "+customers.get(i)[0] + " "+customers.get(i)[1] + " "+customers.get(i)[2] + " \n");
		}
	}

	private static void addNewCustomer() {
		Scanner scanner = new Scanner(System.in); 
		if(customers.size() <= maxCustomerRecords) {
			String[] customerRecord = new String[3];
			System.out.println("PLEASE ENTER CUSTOMER RECORD");
			System.out.println("Enter Customer Name");
			customerRecord[0] = scanner.nextLine();
			System.out.println("Enter Customer Pet Name");
			customerRecord[1] = scanner.nextLine();
			System.out.println("Enter Pet Type");
			customerRecord[2] = scanner.nextLine();
			customers.add(customerRecord);
		} else {
			System.out.println("Maximum customer records exceeded");
		}
	}

	private static void exit() {
		// TODO Auto-generated method stub
		System.out.println("THANKS FOR VISITING");
		
	}

	private static int mainMenu() {
		System.out.println("MAIN MENU - Please select from the below option: \n"
				+ "1. Add new Customer \n"
				+ "2. Display existing Customers \n"
				+ "3. Search Records \n"
				+ "4. Exit  \n");
		int option = scanner.nextInt();
		return option;
	}

}
