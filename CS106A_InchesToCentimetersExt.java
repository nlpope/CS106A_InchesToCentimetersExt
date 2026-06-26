/**
 * File: CS106A_InchesToCentimeters.java
 * ----------------------------
 * This Java program extends CS106A_InchesToCentimeters and
 * asks the user to enter a number of feet & inches as whole 
 * integers which then get converted into centimeters.
 */

public class CS106A_InchesToCentimetersExt extends CS106A_InchesToCentimeters
{
	private static final double INCHES_PER_FOOT = 12.0;
	
	public void run()
	{ 
		promptUser();
	}
	
	
	@Override public void promptUser()
	{
		println("This program converts feet & inches to centimeters.");
		int feet = readInt("Enter number of feet: ");
		int inches = readInt("Enter number of inches: ");
		//calc feet as inches
		double feetToInches = feet * INCHES_PER_FOOT;
		//add inches to result
		double inchTotal = feetToInches + inches;
		double cm = inchTotal * CENTIMETERS_PER_INCH;
		println(feet + "ft " + inches + "in = " + cm + "cm");
		println("donezo");
	}
}