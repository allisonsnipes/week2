
/**
* This is an assignment that will calculate a user's BMI based on data the
* user inputs. The weight MUST be entered in pounds (lbs), which will be 
* converted to kilograms, and the height MUST be entered in inches (in),
* which will be converted to meters.
*
* @author Allison Snipes
*
*/

import java.util.Scanner;

public class BmiProgram {

	public static void main(String[] args) {
		HeaderMessage(); // shows the welcome message to the user to explain what the program is about
		System.out.println("\nYour weight in lbs:");
		// declare all of my necessary variables here that the program will use
		double inKilograms, userEntry1, userEntry2, inMeters;

		// using the scanner input method we need to gather the users' input. Make sure
		// the utlity is imported above
		Scanner input = new Scanner(System.in);
		userEntry1 = input.nextDouble();

		/**
		 * the actualy body of the program. //1. I want to first prompt the user to
		 * enter theirn weight. 2. Next I want to have the user enter their height in
		 * inches. (make sure to include error handling) 3. I want to take the users
		 * input and calculate the bmi. (make sure to include error handling) 4.I need
		 * to have a switch case for when the user wants to quit the program.
		 */
		if (userEntry1 > 0 || userEntry1 < 1000) {
			inKilograms = userEntry1 * 0.45359237;
			System.out.println("\nYou are " + inKilograms + " in kilograms.");
		} else {
			System.out.println("Please enter a weight between 1 - 1000lbs.");
		}

		System.out.println("\nNext enter your height in inches: ");
		userEntry2 = input.nextDouble();

		if (userEntry2 > 0 || userEntry1 < 90) {
			inMeters = userEntry2 * 0.0254;
			System.out.println("You are " + inMeters + " in meters.");
		} else {
			System.out.println("Please enter a weight between 1 - 90in.");
		}

		BmiRanges();

		// BmiCal();
		// }

		// private static void BmiCal() {
		// // declare local variables
		// float bmiFound;
		// BmiRanges();

		// System.out.println("\nWe are going to calculate your BMI based on the
		// information you gave.");
		// System.out.println("Since you are" + inKilograms + " in kilograms, and are "
		// + inMeters + " in meters");

		// double denominator = Math.pow(inMeters, 2); // used this tutorial to find how
		// to use exponents in java
		// // (https://techstuffsarena.com/2020/03/03/exponents-in-java/)
		// bmiFound = inKilograms / denominator;
		// System.out.println("Your BMI is: " + bmiFound);
		// }

	}

	/**
	 * Here I would like to display a greeting to the user to explain to them the
	 * purpose of the application. This will require me to make a function called
	 * HeaderMessage. I delegated the function as private since I do not want other
	 * aspects of my program to bother what I have written inside of the
	 * HeaderMessage function. I learned about the difference between private and
	 * public functions prior to the start of the summer 2020 term via reading the
	 * textbook, and following along with online tutorials.
	 * (https://www.bing.com/videos/search?q=public+vs.+private+java&docid=608033954365243398&mid=208303C99EFB3F2A8793208303C99EFB3F2A8793&view=detail&FORM=VIRE)
	 */
	private static void HeaderMessage() {
		System.out.println("\n");
		System.out.println(
				"Welcome user!\nPlease enter your weight first in pounds (lbs), and then next your height in inches (in) to find your BMI.\nPlease make sure your entries are correct each time before you submit your answer.");
	}

	/**
	 * Here I want the BMI delegations to show up as an independent function. So
	 * that I can call it anywhere in my program as a private function.
	 */
	private static void BmiRanges() {
		System.out.println("\n");
		System.out.println("+---------------------------------+");
		System.out.println("|       BMI Index Reference:      |");
		System.out.println("|   Underweight: less than 18.5   |");
		System.out.println("|      Normal: 18.5 – 24.9        |");
		System.out.println("|      Overweight: 25 – 29.9      |");
		System.out.println("|      Obese: 30 or greater       |");
		System.out.println("+---------------------------------+");
		System.out.println("\n");
	}

}
