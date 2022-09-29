package JavaFiles;

import java.util.*;
import java.io.*;
import java.text.*;

public class WeatherReporter {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the file: ");

		String input = in.nextLine();

		try {
			String fileLoc = "C:\\Users\\sudha\\RaleighWeather2010.txt";
			processFile(fileLoc);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 in.close();
	}

	public static void processFile(String fileName) throws IOException {
		File file = new File(fileName);
		BufferedReader buffReader = new BufferedReader(new FileReader(file));
		String fileLines;
		while ((fileLines = buffReader.readLine()) != null) {
			processFile(fileLines);
		}

	}

	public static void processLine(String line, PrintWriter output) {
		try {
			// String[] lines = line.useDelimiter(",");
			String[] lines = line.split(",");
			SimpleDateFormat inputFormat = new SimpleDateFormat("yyyymmdd");
			SimpleDateFormat outputFormat = new SimpleDateFormat("mm/dd/yyyy");
			String outputDate = outputFormat.format(inputFormat.parse(lines[0]));
			String low = lines[3];
			String high = lines[2];
			String snow = lines[4].charAt(2) == '1' ? "Yes" : "No";
			String rain = lines[4].charAt(1) == '1' ? "Yes" : "No";

			StringBuilder display = new StringBuilder();
			display.append(outputDate)
			.append(" ").append("Low: ").append(low)
			.append(" ").append("High: ").append(high)
			.append(" ").append("Rain: ").append(rain)
			.append(" ").append("Snow: ").append(snow);

			System.out.println(display);
			PrintWriter outputFile = new PrintWriter("C:\\\\Users\\\\sudha\\\\WeatherReporterOutput.txt");
			outputFile.print(display);
			outputFile.close();
			System.out.println("Added File");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Canot parse");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Cant find the file");
		}
	}
/*
 * Scanner lineScanner = new Scanner(readLine);
			lineScanner.useDelimiter(",");
			//String[] linesfromFile = readLine.split(",");

			SimpleDateFormat iFormat = new SimpleDateFormat("yyyymmdd");
			SimpleDateFormat outFormat = new SimpleDateFormat("mm/dd/yyyy");
			String resultDate = outFormat.format(iFormat.parse(linesfromFile[0]));
			String min = lineScanner.findInLine("Low:\\s");
			Double d = lineScanner.nextDouble();
			min = Double.toString(d);
			String max = linesfromFile[2];
			String snowRate = linesfromFile[4].charAt(2) == '1' ? "Yes" : "No";
			String rainRate = linesfromFile[4].charAt(1) == '1' ? "Yes" : "No";

			displayOutput = new StringBuilder();
			displayOutput.append(resultDate).append(" ").append("Low: ").append(min).append(" ").append("High: ")
					.append(max).append(" ").append("Rain: ").append(rainRate).append(" ").append("Snow: ")
					.append(snowRate);
			
			//change the path to your file
			outFile1.print(displayOutput);
			System.out.println(displayOutput);
 */
	
}
