//Solution to Assignment #3: Task 1 - Write a program which
//allows for a user to guess a randomly picked number between 0 and 100.
//Lindsey Vetvick

import java.util.Random;
import java.util.Scanner;

public class Task1_RandomNumberGuessingGame {

	public static void main(String[] args) {
		// create new instance of scanner & random number generator
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		// create variable to identify program state
		String programStart = "yes";

		// initiate a while loop to run the program for as long as the user responds to continue
		while (programStart.equals("yes")) {
			// generate a random number from 0 to 99, then add 1 (so it's 1 to 100)
			int randomNumber = ran.nextInt(100) + 1;

			// ask user for their first guess
			System.out.println("Let's guess a random number! Enter a number between 0 and 100.");
			int userInput = scan.nextInt();
			
			// initiate a nested while loop to run conditionals for as long as the user response is incorrect 
			while (userInput != randomNumber) {
			
				// test user response for being too large
				if (userInput > randomNumber) {
					System.out.println("You've guessed too high! Enter another number to guess again.");
					userInput = scan.nextInt();
					System.out.println("");
				}
			
				// inform the user the response was too low
				else {
					System.out.println("You've guessed too low! Enter another number to guess again.");
					userInput = scan.nextInt();
					System.out.println("");
				}

			}
			
			// congratulate user & ask if the user would like to play again
			System.out.println("Congratulations! You've correctly guessed the random number: " + randomNumber
					+ "! Would you like to play again? Enter yes or no.");
			scan.nextLine();
			programStart = scan.nextLine();
		}
		
		// normalize user response
		programStart.toLowerCase();

		// test whether the user has declined to repeat the program
		if (!programStart.equals("yes")) {
			System.out.println("");
			System.out.println("Nice to play with you! Have a great day.");
			scan.close();
		}
	}
}
