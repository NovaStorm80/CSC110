//========================================================================================
//  Author:   Zechariah Ziebart           csc-110   B
//  Date Due: Oct. 20, 2016
//  Assign:    Assign 10
//  Program:   Decimal Formatting
//  Purpose:
//    understanding decimal formatting
//==========================================================================================
import java.util.*;

public class FreeDay
{
	public static void main (String[] args)
	{
		//Variables
		int temp = 0;

		String water = "yes",
			  active = "yes",
	       likeWater = "yes",
		  likeActive = "yes";
                
               String outputText = "default";

		//Scanner
		Scanner keyboard = new Scanner(System.in);

		//program
		System.out.println("* * * Welcome to Free Day Ideas * * *");

		System.out.print("Enter the temperature it will be : ");
		temp = keyboard.nextInt();
		System.out.print("Do you enjoy the water?(yes/no)  : ");
		likeWater = keyboard.next();
		System.out.print("Do you like being active?(yes/no): ");
		likeActive = keyboard.next();

		
		//if statements
		if (temp >= 70) {

			if (likeWater.equalsIgnoreCase(water)) {
				outputText = "it's great weather for a boat ride";
                        }
                }
                else if (temp >= 55) {
				if (likeActive.equalsIgnoreCase(active)) {
					outputText = "tennis will keep you energized";
                                } else {
					outputText = "it is a nice day to watch a local sporting event";
				}
                }
                else {
			if (likeActive.equalsIgnoreCase(active)) {
					outputText = "try a quick paced walk (or jog) in this brisk air";
                        } else {
					outputText = "make a cup of hot cider and put up your feet";
		 	}
                }
                
                System.out.println("\nWith the predicted temperature of: " + temp);
		System.out.println("This program suggests " + outputText);
	}
}
