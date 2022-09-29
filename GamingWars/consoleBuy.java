package GamingWars;

public class consoleBuy {
	private String consoleName;
	private String consoleGame;
	private double gamePrice;
	static double  consolePrice;
	static double taxPrice=0.02;

	public consoleBuy() {
		this.consoleName = consoleName;
		this.consoleGame = consoleGame;
		this.gamePrice = gamePrice;
	}

	public void finalPrice() {
		
		
		System.out.println("ItemName: " + consoleName);
		if (consoleName.equals("PS4")) {
			consolePrice = 400*taxPrice +(400);
			System.out.println("---Receipt--- ");
			System.out.println(" Amount Paid for PlayStation 4 is : $ " + consolePrice);

		}
		if (consoleName.equals("XB1")) {
			consolePrice = 399*taxPrice +(399);
			System.out.println("---Receipt--- ");
			System.out.println(" Amount Paid for Xbox One is : $ " + consolePrice);

		}
		if(consoleGame.equals("Xbox Series S/X")) {
			consolePrice = 599*taxPrice +(599);
			System.out.println(" ---Receipt--- ");
			System.out.println(" Amount Paid for Xbox Series S/X is : $ " + consolePrice);
			
			
		}
		System.out.println("Tax Price is: " + taxPrice);
		System.out.println(" Console Name : " + getConsoleGame());
		System.out.println(" Console Price : "+ getGamePrice());

	}
	// Getters and Setters
	public String getConsoleName() {
		return consoleName;
	}

	public void setConsoleName(String consoleName) {
		this.consoleName = consoleName;
	}

	public String getConsoleGame() {
		return consoleGame;
	}

	public void setConsoleGame(String consoleGame) {
		this.consoleGame = consoleGame;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double cPrice) {
		this.gamePrice = cPrice;
	}

}
