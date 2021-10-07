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
		
		// create die object with 0 arg constructor
		die = new Die();
        System.out.println("Creating die " + die.getName());
        System.out.println("Default up side for die " + die.getName() + " is " + die.getCurrentSideUp());
        System.out.println("Rolling the die " + die.getName());
        die.roll(); // method to roll the die
        System.out.println("New value up for die is " + die.getCurrentSideUp()); // print up side after rolling die

        System.out.print("\nEnter the number of sides for your 2nd dice ");
        int numSide = scanner.nextInt(); // scans number of sides for die
        myOtherDie = new Die(numSide); // pass number of sides in constructor
		
		//set values using setters
        myOtherDie.setName("D" + numSide);
        myOtherDie.setCurrentSideUp(new Random().nextInt(myOtherDie.getNumSides()) + 1);
		
		System.out.println("Creating die " + myOtherDie.getName());
        System.out.println("Default up side for die " + myOtherDie.getName() + " is " + myOtherDie.getCurrentSideUp());
        System.out.println("Rolling die " + myOtherDie.getName());
		
		// roll the die
        myOtherDie.roll();
        System.out.println("New value up for die is " + myOtherDie.getCurrentSideUp()); // print side up after rolling

		// input the name and number of sides for die
        System.out.print("\nEnter the name for your 3rd dice ");
		String diceName = scanner.next();
		System.out.println("Enter the number of sides in your 3rd dice");
		int numOfSide = scanner.nextInt(); 
		
		// create die object with 2 args
        mySpecialDie = new Die(numOfSide, "D" + numOfSide);
        mySpecialDie.setCurrentSideUp(new Random().nextInt(mySpecialDie.getNumSides()) + 1); //set side up using setters
		
        System.out.println("Creating die " + mySpecialDie.getName());
        System.out.println("Default up side for die " + mySpecialDie.getName() + " is " + mySpecialDie.getCurrentSideUp());
        System.out.println("Rolling die " + mySpecialDie.getName());
        
		// roll the die
		mySpecialDie.roll();
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
		