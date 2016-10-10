package q4;
import java.util.Scanner;
/** {@ChangeDoc}.
* <p> This class receive the value of cube side 
* and calculate its area and volume.</p>
* @author Ron Tran, set A
*@version 1.0
*/
public class Cube {
    /**
     * <p>This is the main method that will be called when you 
     * try to run the class. It is the main entry point 
     * to the program.</p> 
     * @param cube cube
     */ 
 public static void main(String [] cube) {
 Scanner scan = new Scanner(System.in);
 int cubeside;
 System.out.print(" Please enter the value of the cube side ");
 cubeside = scan.nextInt();
 /**
  *<p> This declare the side variable,
  *and asks the user for the input.</p>
  */
 final double area = (6 * Math.pow(cubeside, 2));
 final double volume = Math.pow(cubeside, 3);
 System.out.println(" The area of the cube is " + area);
 System.out.println(" The volume of the cube is " + volume);
 scan.close();
 /**
  * <p>This calculates the area and the volume
  * of the cube and print the results</p>
  */
 System.out.println(" Question 4 was called and ran successfully ");
} 
}
