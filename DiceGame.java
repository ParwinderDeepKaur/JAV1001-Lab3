import java.util.Scanner;
import java.util.Random;

/**
* @author  Parwinder Deep Kaur
* @version 1.0
* @since   2021-10-05

* Name: Parwinder Deep Kaur
* Student ID: A00237487
* The program shows the use of Model class and Contructors of various times
* Contructor with 0 arg shows current side before rolling and its new value after rolling
* Constructor with 1 arg takes number sides from user, then shows current side up and new vallue after rolling
* Constructor with 2 args takes number sides & die name from user, then shows current side up and new vallue after rolling
* Finall
*/

public class DiceGame{
	
	public static Scanner scanner = new Scanner(System.in);	// initialize scanner
	public static Die die, myDie, specialDie;
	
	public static void main(String args[]){
		
		die = new Die(); // no argument in contructor
		System.out.println("Creating a default D6\nThe current side up for " + die.getType () + " is " + die.getCurrentSideUp()); // get current side up from die obj
		System.out.println("Rolling the D6\nThe new value is " + rollDie(die.getNumOfSides())); // get new value after rolling
		
		System.out.println("\nEnter the number of sides in your 2nd die");
		int diceSide = scanner.nextInt(); // input number of sides in die from integer
		myDie = new Die(diceSide); // pass 1 argument in contructor
		System.out.println("Creating a D" + myDie.getNumOfSides()); // print number of sides with die object
		System.out.println("The current side up for " + myDie.getType() + " is " + myDie.getCurrentSideUp()); // name and current side from die object
		System.out.println("Rolling the " + myDie.getType()); // print die name
		System.out.println("The new value is " + rollDie(myDie.getNumOfSides())); // get new value after rolling
		
		System.out.print("\nEnter the name for your 3rd dice ");
		String diceName = scanner.next(); // input die name in String variable
		System.out.println("Enter the number of sides in your 3rd dice");
		int numDieSide = scanner.nextInt(); // input number of die in Integer variable
		specialDie = new Die(numDieSide, diceName); // pass 2 arguments in contructor
		System.out.println("Creating a " + specialDie.getType()); //die type
		System.out.println("The current side up for " + specialDie.getType() + " is " + specialDie.getCurrentSideUp()); // die type and current side up from specialDie obj
		System.out.println("Rolling the " + specialDie.getType()); //die type
		System.out.println("The new value is " + rollDie(specialDie.getNumOfSides())); // new value after rolling
		
		// show maximum number of sides of specialDie obj
		System.out.println("\nSetting the " + specialDie.getType() + " to show " + specialDie.getNumOfSides());
		boolean foundMax = false;
		int count = 1; // to show number of iterations needed to get max value
		// while loop will run until the max value is not found
		while(!foundMax){
			count++;
			//  match max value with number of sides in specialDie
			if (rollDie(specialDie.getNumOfSides()) == specialDie.getNumOfSides()){
				System.out.println("The side up is now "+ specialDie.getNumOfSides() +" after rolling " + count + " times.");
				foundMax = true; // make true to stop the loop
			}
		};
	}	
	
	/**
	* rollDie method to get the maxNum sides of die and show the random value means current side up
	* @param maxNum is the maximum sides in the dice
	* @return generate random number in between 1 and maxNum
	*/
	public static int rollDie(int maxNum){
		return new Random().nextInt(maxNum - 1 + 1) + 1;
	}
}
		