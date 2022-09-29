package JavaFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Weather1 {
	static StringBuilder displayOutput;

	public static void main(String args[]) {
		// System.out.println(new File("test.txt").getAbsolutePath());
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String fileName = input.nextLine().trim();
		try {
			// add the original path : INPUT FILE
			File file = new File("C:\\Users\\sudha\\eclipse-workspace\\JavaProjekts\\src\\JavaFiles\\" + fileName);
			BufferedReader buffReader = new BufferedReader(new FileReader(file));
			// add the original path to OUTPUT file
			PrintWriter outFile1 = new PrintWriter("C:\\Users\\sudha\\WeatherOutput.txt");
			String readLine;
			while ((readLine = buffReader.readLine()) != null) {
				processLine(readLine, outFile1);
				continue;
			}
			outFile1.close();
			buffReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException pe) {
			pe.printStackTrace();
		}

		input.close();

	}

	public static void processLine(String readLine, PrintWriter outFile1) throws ParseException {

		Scanner lineScanner = new Scanner(readLine);
		lineScanner.useDelimiter(",");
		// String[] linesfromFile = readLine.split(",");

		SimpleDateFormat iFormat = new SimpleDateFormat("yyyymmdd");
		SimpleDateFormat outFormat = new SimpleDateFormat("mm/dd/yyyy");
		String[] lines = new String[5];
		int i = 0;
		while (lineScanner.hasNext()) {
			lines[i] = lineScanner.next();
			// System.out.println(lines[i]);
			i++;
		}
		String min = lines[3];
		String high = lines[2];
		String resultDate = outFormat.format(iFormat.parse(lines[0]));
		String snowRate = lines[4].charAt(2) == '1' ? "Yes" : "No";
		String rainRate = lines[4].charAt(1) == '1' ? "Yes" : "No";

		displayOutput = new StringBuilder();
		displayOutput.append(resultDate).append(" ").append("Low: ").append(min).append(" ").append("High: ")
				.append(high).append(" Rain: ").append(rainRate).append(" ").append(" Snow: ").append(snowRate)
				.append("\n");

		// change the path to your file
		outFile1.print(displayOutput);
		System.out.println(displayOutput);
		lineScanner.close();

	}

}
