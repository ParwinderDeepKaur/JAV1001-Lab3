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
	public static Die die, myOtherDie, mySpecialDie;	// objects of model class
	
	public static void main(String args[]){
		
		// die 1
		die = new Die(); // empty constructor
        System.out.println("Creating die " + die.getName());
		die.roll(); // calculates default up side value 
        System.out.println("Default up side for die " + die.getName() + " is " + die.getCurrentSideUp());
        System.out.println("Rolling the die " + die.getName());
        die.roll(); // roll the die to get new value
        System.out.println("New value up for die is " + die.getCurrentSideUp()); // print side up after rolling
		
		// die 2
        System.out.print("\nEnter the number of sides for your 2nd die ");
        int numSide = scanner.nextInt();
        myOtherDie = new Die(numSide); // create die object with 1 arg
        myOtherDie.setName("D" + numSide); //set values using setters
        myOtherDie.roll(); // calculates default up side value 
        System.out.println("Default up side for die " + myOtherDie.getName() + " is " + myOtherDie.getCurrentSideUp());
        System.out.println("Rolling die " + myOtherDie.getName());
        myOtherDie.roll(); // roll the die to get new value
        System.out.println("New value up for die is " + myOtherDie.getCurrentSideUp()); // print side up after rolling
		
		// die 3
        System.out.print("\nEnter the name for your 3rd dice ");
		String diceName = scanner.next();
		System.out.println("Enter the number of sides in your 3rd die");
		int numOfSide = scanner.nextInt();
		mySpecialDie = new Die(numOfSide, diceName); // create die object with 2 args
		mySpecialDie.roll(); // calculates default up side value
		System.out.println("Default up side for die " + mySpecialDie.getName() + " is " + mySpecialDie.getCurrentSideUp());
		System.out.println("Rolling die " + mySpecialDie.getName());
		mySpecialDie.roll(); // roll the die for new value
		System.out.println("New value up for die is " + mySpecialDie.getCurrentSideUp()); // print side up after rolling
		
		// show maximum number of sides of mySpecialDie obj
		System.out.println("\nSetting the " + mySpecialDie.getName() + " to show " + mySpecialDie.getNumSides());
		boolean foundMax = false;
		int count = 1; // to show number of iterations needed to get max value
		// while loop will run until the max value is not found
		while(!foundMax){
			count++;
			mySpecialDie.roll(); // roll the die to update the current side up
			
			//  match current side up with number of sides in specialDie
			if (mySpecialDie.getCurrentSideUp() == mySpecialDie.getNumSides()){
				System.out.println("The side up is now "+ mySpecialDie.getNumSides() +" after rolling " + count + " times.");
				foundMax = true; // make true to stop the loop
			}
		};
	}	
}
		