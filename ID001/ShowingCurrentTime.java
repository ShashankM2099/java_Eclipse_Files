/* @author Shashank Mondrati
 * @version 1.0.1
 * @date 1/27/2020
 * 
 *  How do you obtain current second, current minute and current hour?
 *  TO obtain current seconds we have to mod total seconds  by 60
 *  TO obtain current minutes by current minutes modulus by 60
 *  TO get current hour , modulus totalHours by 24
 */
package ID001;
import java.util.Scanner;
public class ShowingCurrentTime {
	public static void main(String[] args) {
		long totalMilliseconds= System.currentTimeMillis();
		long totalSeconds= totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes= totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = (totalHours % 24);
		System.out.println("Current time is " +currentHour+  ":" + currentMinute+  ":" + currentSecond + " GMT");
	}
}
