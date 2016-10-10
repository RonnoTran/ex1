package q3;
import java.util.Scanner;
/** {@ArithmeticDoc}.
* <p> This class receives the input of two float numbers 
* and calculates their sum, difference, quotient 
* and product.</p>
* @author Ron Tran, set A 
*@version 1.0
*/
public class Arithmetic {
     /**
     * <p>This is the main method that will be called when you 
     * try to run the class. It is the main entry point 
     * to the program.</p> 
     * @param args args
     */
 public static void main(String []args) {
Scanner scan = new Scanner(System.in);
 float number1;
 float number2;
 
 System.out.print("Enter the value of the first number");
 number1 = scan.nextFloat();
 System.out.print("Enter the value of the second number");
 number2 = scan.nextFloat();
 /**
  * <p> This asks the user to enter the value of
  * the two numbers.</p>
  */
 double sum = number1 + number2;
 double difference = number1 / number2;
 double quotient = number1 % number2;
 double product = number1 * number2;
 System.out.print(" The sum of these two numbers is : " + sum);
 System.out.print("\n The difference of these two numbers is : " + difference); 
 System.out.print("\n The quotient of these two numbers is : " + quotient);
 System.out.print("\n The product of these two numbers is : " + product);
 System.out.println("\n Question 3 was called and ran successfully ");
 scan.close();
 /**
  * <p> This calculates the sum, difference, 
  * quotient, and product of these 
  * two numbers.</p>
  */
 }
}
