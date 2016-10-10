package q2;
import java.util.Scanner;
/** {@SecondConvertDoc}.
* <p>This class converts second to hours and minutes</p>
* @author Ron Tran, Set A
*@version 1.0
*/
public class SecondConvert {
/**
 ** <p>This is the main method that will be called when you 
 * try to run the class. It is the main entry point 
 * to the program.</p> 
 ** @param args 
 */
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
 int second;
 final int minute = 60;
 final int hour = 3600;
 System.out.print(" Please enter the value of second ");
 second = scan.nextInt();

 int hh = second / hour;
 int mm = (second % hour) / minute;
 int ss = (second % hour) % minute;
 scan.close(); 
 System.out.println(" The result is " + hh + ":" + mm + ":" + ss);
 System.out.println(" Question two was called and ran sucessfully ");
 }
}
