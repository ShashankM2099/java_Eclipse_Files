package dayEx1;

public class fizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five
		// and Multiples of 3 and 5 return FizzBuzz....so start with 100
		// For numbers that are neither, return the input number.
		int n = 100;
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) { // multiples of 3 and 5 print FizzBuzz
				System.out.println("FizzBuzz " + " ");

			} else if (i % 3 == 0) { // for multiples of 3 print Fizz
				System.out.println("Fizz " + " ");
			} else if (i % 5 == 0) { // for multiples of 5 print Buzz 
				System.out.println("Buzz " + " ");
			} else if (i % 3 != 0 || i % 5 != 0) { // for multiples of nor 3 or 5 print the number
				System.out.println(i + " ");
			}

		}
	}

}
