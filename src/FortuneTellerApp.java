import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
/* 	I:	Input
		Ask the user for:
		1. 	first name.
		2. 	last name.
		3. 	age.
		4. 	birth month (as an 'int').
		5. 	favorite ROYGBIV color.
		6. 	If the user does not know what ROYGBIV is, ask the user to enter
			& “Help” to get a list of the ROYGBIV colors.
		7. number of siblings.
	II:	Tests
		1. 	If the user’s age is an odd number, 
			then the user will retire in x years
			if the user's age is odd, or y years if user's age is even.
		2. 	If the user’s number of siblings is zero, then they will have a
			vacation home in ____ (location),
			if one then they will have a vacation home in ____ (location),
			if two then they will have a vacation home in ____ (location),
			if three then they will have a vacation home in ____ (location), or
			if more than three then they will have a vacation home in ____ (location).
			If the user enters anything other than a number greater than or equal to 0,
			they should get a bad vacation home!
		3. 	Depending on which ROYGBIV color is the user’s favorite,
			they will have a specific mode of transportation (i.e. car, boat, plane, etc.).
		4. 	If the user’s birth month is 1-4, they will have $____ in the bank;
			if the user's birth month is 5-8, they will have $____ in the bank;
			and if it is 9-12, then they will have $____ in the bank.
			If the user enters something other than 1-12 as their birth month,
			they will have $0.00 in the bank.
	III:Output
			The user’s fortune should be thus:
		1. 	[First Name] [Last Name]
		2. 	will retire in [# of Years]
		3. 	with [Amount of Money] in the bank,
		4. 	a vacation home in [Location]
		5. 	and a [Mode of Transportation].
		* 	Note: 	Program should be able to handle whether or not a user inputs
					capital or lowercase letters. */

// I.	Input
		Scanner input = new Scanner(System.in);
//		1. 	First Name	
		System.out.println("What is your first name?");
		String nameFirst = input.nextLine();
//		2. 	Last Name
		System.out.println("What is your last name?/b");
		String nameLast = input.nextLine();
//		3.	Age
		System.out.println("What is your age?");
		int age = input.nextInt();
//		4.`Birth Month
		System.out.println("What is your numeric birth month? (1-12)");
		int birthMonth = input.nextInt();
//		5.	Favorite ROYGBIV
		System.out.println("What is your favorite ROYGBIV color? "
				+ "(What is ROYGBIV? Enter \"Help\" for list of the ROYGBIV colors.)");
		String roygbiv = input.next();
// 		6. if "Help", then explain ROYGBIV, & ask favorite ROYGBIV again
		if (roygbiv.equalsIgnoreCase("HELP")) 
		{
            System.out.println("Input one of the following of ROYGBIV colors:");
            System.out.println(" Red, Orange, Yellow, Green, Blue, Indigo, or Violet");
            String response2 = input.next();
            roygbiv = response2;
        }
//		7. # Siblings
		System.out.println("How many siblings do you have? ");
		int siblings = input.nextInt();

// II.	Tests
// 		1. 	Age (Odd/Even) = Years To Retire 
		int yearsRetire;
//			If Age Even
		if (age % 2 == 0) 
		{yearsRetire = 50;} 
//			If Age Odd
		else 
		{yearsRetire = 5;}
		
// 		2. 	#Siblings = Vacation Home Location
		String vacationHomeLocation;
//		If <0, then bad location
		vacationHomeLocation ="DS-1 Orbital Battle Station (0 ABY)";
//		If >0
		if (siblings == 0)
		{vacationHomeLocation = "Naboo";}
		else if (siblings == 1)
		{vacationHomeLocation = "Cloud City";}
		else if (siblings == 2)
		{vacationHomeLocation = "Forest Moon of Endor";}
		else if (siblings == 3)
		{vacationHomeLocation = "Ahch-To";}
		else if (siblings >= 4)
		{vacationHomeLocation = "Yavin 4";}
		else {vacationHomeLocation ="DS-1 Orbital Battle Station (0 ABY)";}
		
//		3. ROYGBIV = Mode of Transportation
		String modeOfTransportation = null;
//		change roygbiv responses to lower case to fit expected data
		if(roygbiv.toLowerCase().equals("red"))
		{modeOfTransportation = "Incom Corporation T-16 Skyhopper";}
		if(roygbiv.toLowerCase().equals("orange"))
		{modeOfTransportation = "Kuat Drive Yards All Terrain Armored Transport Combat Walker";}
		if(roygbiv.toLowerCase().equals("yellow"))
		{modeOfTransportation = "Aratech Repulsor Company 74-Z Speeder Bike";}		
		if(roygbiv.toLowerCase().equals("green"))
		{modeOfTransportation = "Incom-FreiTek T-85 X-wing";}	
		if(roygbiv.toLowerCase().equals("blue"))
		{modeOfTransportation = "Corellian Engineering Corporation YT-1300 (heavily and illegally modified)";}
		if(roygbiv.toLowerCase().equals("indigo"))
		{modeOfTransportation = "Ubrikkian Industries Sail Barge";}	
		if(roygbiv.toLowerCase().equals("voilet"))
		{modeOfTransportation = "Tauntaun";}	

		
// 		4. Birth Month = $ MIB
		int amountOfMoney;
		amountOfMoney = 0;
//		birthMonth 1 - 4 = $400,000.00 ("$" & ".00" added at output)
		if (birthMonth > 0 && birthMonth <=4) {amountOfMoney = 400000;}
//		birthMonth 5 - 8 = $350,000.00 ("$" & ".00" added at output)
		if (birthMonth >= 5 && birthMonth <=8) {amountOfMoney = 350000;}
//		birthMonth 9 - 12 = $10,000,000.00 ("$" & ".00" added at output)
		if (birthMonth >= 9 && birthMonth <=12) {amountOfMoney = 10000000;}
		
		
// III.	Output
		System.out.print
		(nameFirst + " " + nameLast 
		+ " will retire in " + yearsRetire + " years with "
		+ "$" + amountOfMoney + ".00 in the bank, " 
		+ "with a vacation home on " + vacationHomeLocation 
		+ ", and travele via " + modeOfTransportation + ".");
	}

}
