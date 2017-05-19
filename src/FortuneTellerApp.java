import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
// Part 1: Input
	// Ask the user for:
		// 1. first name.
		// 2. last name.
		// 3. age.
		// 4. birth month (as an 'int').
		// 5. favorite ROYGBIV color.
		// 6. If the user does not know what ROYGBIV is, ask the user to enter
		// “Help” to get a list of the ROYGBIV colors.
		// 7. number of siblings.
		// Part 2

		// 1. If the user’s age is an odd number, 
		//    then the user will retire in x years
		//    if the user's age is odd, or y years if user's age is even.
		// 2. If the user’s number of siblings is zero, then they will have a
		// vacation home in ____ (location),
		// if one then they will have a vacation home in ____ (location),
		// if two then they will have a vacation home in ____ (location),
		// if three then they will have a vacation home in ____ (location), or
		// if more than three then they will have a vacation home in ____
		// (location).
		// If the user enters anything other than a number greater than or equal
		// to 0,
		// they should get a bad vacation home!
		// 4. Depending on which ROYGBIV color is the user’s favorite,
		// they will have a specific mode of transportation (i.e. car, boat,
		// plane, etc.).
		// 5. If the user’s birth month is 1-4, they will have $____ in the
		// bank;
		// if the user's birth month is 5-8, they will have $____ in the bank;
		// and if it is 9-12, then they will have $____ in the bank.
		// If the user enters something other than 1-12 as their birth month,
		// they will have $0.00 in the bank.
		// Part 3
		// The user’s fortune should be thus:
		// 1. [First Name] [Last Name]
		// 2. will retire in [# of Years]
		// 3. with [Amount of Money] in the bank,
		// 4. a vacation home in [Location]
		// 5. and a [Mode of Transportation].
		// * Program should be able to handle whether or not a user inputs
		// capital or lowercase letters.

		Scanner input = new Scanner(System.in);
		System.out.println("What is your first name?");
		String nameFirst = input.nextLine();

		System.out.println("What is your last name?");
		String nameLast = input.nextLine();

		System.out.println("What is your age?");
		int age = input.nextInt();

		System.out.println("What is your numeric birth month? (1-12)");
		int birthMonth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color. "
				+ "What is ROYGBIV? Enter 'Help' for list of the ROYGBIV colors.");
		String ROYGBIV = input.next();

		System.out.println("How many siblings do you have? ");
		int siblings = input.nextInt();

// Part 2: Tests
	// Years to Retire (Odd/Even)
		int yearsRetire;
		// Retire Age - Odd or Even
		if (age % 2 == 0) 
		{yearsRetire = 50;} 
		else 
		{yearsRetire = 5;}
		
		

// Output
		System.out.print(nameFirst + " " + nameLast + " will retire in " 
		+ yearsRetire + " years with "
				+ "[amountOfMoney] in the bank, " + "with a vacation home in [vactionHomeLocation], and "
				+ "a [modeOfTransportation].");
	}

}
