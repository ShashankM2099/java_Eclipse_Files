

/** This class is to show you guys on how you can create your own methods for stuff
 * Here, we use methods to make simple calculator. There are errors here so fix them. 
 * I do not know what else to comment so ... w/e
 * @author Devansh Desai
 * @version 1.0
 * 
 */
 package helloWorld;
import java.util.Scanner;
public class calcProject2 {
	public static void main(String[] args)
	{ Scanner scan = new Scanner(System.in);
		int ch=0;
		String input=null;
		
		int first = 0;
		int second = 0;
		
		do {
			
			
		  System.out.println("Welcome to world of Math Functions!!!");
		 
		  System.out.println("Enter 1st number : ");
		   first = scan.nextInt();
		  System.out.println("Enter 2nd number : ");
		   second = scan.nextInt();
		  
		  System.out.println("What would you like to do with those numbers?\nMenu \n");
		  System.out.println("1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n"); 
		  //Am i missing a option here?
		  ch=scan.nextInt();
		  switch (ch) {
		  case 1 : 
		   
			  System.out.println(add(first,second));
		   
		   break;
		  case 2:
			  System.out.println(first - second); //add code to subtract
		   
		   break;
		  case 3:
			  System.out.println(first * second); //add code to multiply
		   
		   break;
		  case 4: 
			  
			  System.out.println(first/ second ); // add code to divide. 
		   
		   break;
		  default :
			  System.out.println(Math.pow(first, second)); //add code to show square of number
		   
		   break;
		   
		   
		  }
		  System.out.println("Enter exit to stop");
			 input =scan.next();
		  
		 
		} while(!(input.equals("exit")));
		
	

		
	}
	
	private static int add(int a, int b) //This method will add integers a and b
	{
		return a+b; //Something wrong with this line
	}
	
	private static int subtract(int a, int b)
	{
		return a - b; //It returns the subtraction of a and b.
	}
	
	private static int multiply(int a, int b) //hmm.. i wonder what is the error here.
	{
		return a * b;
	}
	
	private static double division(int a, int b)
	{
		return a/b ;//I forgot what goes in here, so please help me. 
	}
	
	private static double square(int a)
	{
		return a*a;
	}
	
	//MAKE 2 OF YOUR OWN METHODS FOR DIFFERENT MATH FUNCTIONS AND SHOW IT TO YOUR TA. 
	//YOU CAN USE THE ABOVE AS REFERENCE AS SOON AS YOU FIX THE ERRORS,
	//ADD NECESSARY STAEMENTS IN THE MENU AND IN THE SWITCH STATEMENT TO MAKE SURE THE PROGRAM WORKS CORRECTLY.
}


