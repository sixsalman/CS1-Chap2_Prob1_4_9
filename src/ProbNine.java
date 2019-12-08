import java.util.*; // all java utilities imported

/**
	Author: Salman
	
	This program takes the number of miles driven, gallons of gas used,
	calculates mpg and outputs it.
*/
public class ProbNine {

	/**
	 Main handles the driver code for the program. Inputs are taken,
	 processed and outputted in this method.
	 */
	public static void  main (String[] args) {
		Scanner kbd = new Scanner(System.in); // new scanner created
		System.out.print("Enter no. of miles driven: ");
		double miles = kbd.nextInt(); // no. of miles driven obtained from user and stored in an integer variable called 'miles'
		System.out.print("Enter gallons of gas used: ");
		double gallons = kbd.nextInt(); // no. of gallons used obtained from user and stored in an integer variable called 'gallons'
		double mpg = (double)miles/gallons; // mpg calculation made and stored in a variable called 'mpg'
		System.out.println("Your car's MPG is: " + mpg); // mpg displayed
		kbd.close(); // scanner closed
	} 
}