//Solution to Assignment #3: Task 2 - Write a program which
//allows for a user to practice their multiplication tables considering
//parameters input by the user.
//Lindsey Vetvick

import java.util.Scanner;

public class Task2_MultiplicationTablesLoops {

	public static void main(String[] args) {
		// create new instance of scanner
		Scanner scan = new Scanner(System.in);

		// create variable to identify program state
		String programStart = "yes";

		// initiate a while loop to run the program for as long as the user responds to continue
		while (programStart.equals("yes")) {

			// create variables for multiplication table
			int baseNumber;
			int multiplier;

			// ask user for the base number of the multiplication
			System.out.println("Please enter the number for which you want to practice multiplication tables:");
			baseNumber = scan.nextInt();
			System.out.println("");

			// ask user for the upper boundary for the multiplication
			System.out.println("Up to what number would you like to practice your multiplication using " + baseNumber
					+ " as your base number?");
			multiplier = scan.nextInt();
			System.out.println("");

			// test user multiplication table parameters for negative or zero numbers input
			if (baseNumber <= 0 || multiplier <= 0) {
				// reject user parameters
				System.out.println("This program does not accept zeros or negative numbers as input.");
			}

			// run a for loop to execute the multiplication table
			else {
				for (int i = 1; i <= multiplier; i++) {
					System.out.println("What is " + baseNumber + "*" + i + "?");

					int userResponse = scan.nextInt();

					// test whether the user response is incorrect
					if (userResponse != (i * baseNumber)) {
						System.out.println("Whoops! That's incorrect. The correct answer is " + (baseNumber * i) + ".");
						System.out.println("");
					}

					// congratulate user and continue for loop
					else {
						System.out.println("That's correct!");
						System.out.println("");
					}
				}
			}

			// ask user if they would like to continue practicing their multiplication tables
			System.out.println("End of program. Would you like to restart the program? Enter yes or no.");
			scan.nextLine();
			programStart = scan.nextLine();

		}

		// normalize user response
		programStart.toLowerCase();

		// test to see if the user has declined to repeat the program
		if (!programStart.equals("yes")) {
			System.out.println("End of practice. Have a great day!");
			scan.close();
		}
	}
}
