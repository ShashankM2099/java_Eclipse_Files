package LAB03;

public class Methods {

	public static void main(String[] args) {

		displayInstructions();

	}

	public static void displayInstructions() {
		System.out.println(
				"First, the dealer and player each start with two cards drawn. \nThe goal of the game is to get as close to 21 card points as possible."
						+ "\nHaving a card total of 21 points results in a win (unless the dealer also has a total of 21 points, in which case, it is a tie)"
						+ "\nIf anyone goes over 21 points, they automatically lose. "
						+ "\nIf both the dealer and player get over 21 card points, it is a tie. Otherwise, whoever is closest to 21 is deemed winner.");

	}
}
