package q1;
import java.util.Scanner;
/** {@ChangeDoc}.
 * <p> This class teaches you how to make a change calculator</p>
 * @author Ron Tran , Set A
 *@version 1.0
 */
public class Change {
/**
 * <p>This is the main method that will be called when you 
 * try to run the class. It is the main entry point 
 * to the program.</p> 
 * 
 * @param args args 
 */
 public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);  
final double amount;
final double tenDollar = 10;
final double fiveDollar = 5;
final double twoonie = 2;
final double quarter = 0.25;
final double dime = 0.10;
final double nickle = 0.05;
final double penny = 0.01;
/**
 * <p> This declares all needed variables.</p>
 */
 int tenBill;
 int fiveBill;
 int twoDollar;
 int twentyFiveCent;
 int tenCent;
 int fiveCent;
 int oneCent;
 double remain1;
 double remain2;
 double remain3; 
 double remain4; 
 double remain5; 
 double remain6; 
 
 System.out.print("Please enter the amount ");
  amount = scan.nextDouble();
/**
 * <p>This asks for input of the user amount.</p>   
 */
  tenBill = (int) (amount / tenDollar);
  remain1 = (amount % tenDollar);

  fiveBill = (int) (remain1 / fiveDollar);
  remain2 = (remain1 % fiveDollar);
 
  twoDollar = (int) (remain2 / twoonie); 
  remain3 =  (remain2 % twoonie);

  twentyFiveCent =  (int) (remain3 / quarter);  
  remain4 = (remain3 % quarter);    
  
  tenCent = (int) (remain4 / dime);  
  remain5 = (remain4 % dime);
  
  fiveCent = (int) (remain5 / nickle);  
  remain6 = (remain5 % nickle);
  
  oneCent = (int) (remain6 / penny);  
  
/**
 * <p>This calculate the number of the needed type of money 
 * and it also calculates the money remaining.</p>  
 */
 System.out.println("You have " + tenBill + " ten dollar bills");
 System.out.println("You have " + fiveBill + " five dollar bills");
 System.out.println("You have " + twoDollar + " two dollar bills");
 System.out.println("You have " + twentyFiveCent + " quarters "); 
 System.out.println("You have " + tenCent + " dimes ");
 System.out.println("You have " + fiveCent + " nickle ");
 System.out.println("You have " + oneCent + " pennies ");
 scan.close(); 
 /**
  * <p>This receives and prints out the result.</p>
  */
 System.out.println(" Question one was called and ran successfully.");
 
}
}
