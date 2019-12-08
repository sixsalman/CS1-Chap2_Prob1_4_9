/**
	Author: Salman
	
	This program prints stored data for name, age, desired annual pay.
*/
public class ProbOne {

	/**
	 Main handles the driver code for the program. Inputs are taken,
	 processed and outputted in this method.
	 */
	public static void  main (String[] args) {
		String name = "Abc"; // a string is assigned to string variable named 'name'
		int age = 12; // a number assigned to integer variable named 'age'
		double annualPay = Double.MAX_VALUE; // desired annual pay assigned to a double typre variable called 'annualPay'
		System.out.println("My name is " + name + ", my age "
		+ "is " + age + " and\nI hope to earn $" + annualPay
		+ " per year."); // previously assigned information is displayed
	}
}