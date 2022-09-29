package GamingWars;

import java.util.*;

public class mainMethod {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			try {

				consoleBuy game1 = new consoleBuy();
				System.out.println("$$$$$$$$$$$$$ Welcome To GamingWars $$$$$$$$$$$$$ ");
				System.out.println(
						" Enter 'XB1' for Xbox One \n 'PS4' for PlayStation 4 \n 'Xbox Series X/S' for Xbox Series Consoles");

				System.out.println(" Enter your Console Name: ");
				String cName = sc.nextLine();
				if (cName.equals("XB1") || cName.equals("PS4") || cName == "Xbox Series X/S") {
					game1.setConsoleName(cName);
					System.out.println(" Enter your Console Game: ");
					String cGame = sc.nextLine();
					game1.setConsoleGame(cGame);
					System.out.println(" Enter your game Price: ");
					double cPrice = sc.nextDouble();
					game1.setGamePrice(cPrice);
					game1.finalPrice();
				} else {

					System.out.println("----Wrong Input---- \n ----Please Try Again----");

					break;
				}

				System.out.println(" Enter 1 to Quit the program: ");
				int quit = sc.nextInt();
				if (quit == 1) {
					System.out.println("---- Thanks for your purchase ---- ");
					break;

				}

			} catch (InputMismatchException ex) {
				System.out.println("Wrong Input");

			}

		}
	}

}
