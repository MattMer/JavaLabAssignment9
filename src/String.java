/*
 * Matthew G. Mershon         4/2/14
 * CSIS 293-9240              Mr. Giron
 * LabAssignement 9
 * Description: Write a method to invert user string. Provide Main program to demonstrate.
 */
import java.util.Scanner;
public class String {

	 public static void main(java.lang.String[] args) //Using java.lang.String here and other places since class is named String.
	   {
	      java.lang.String original;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to reverse"); //Asking user to input a string.
	      original = in.nextLine(); //Assigning that string to variable original.
	      // @args passing the original string to ReverseString method.
	      System.out.println("Reverse of entered string is: "+ ReverseString.mirrorString(original)); //Output reversed string.
}
}
