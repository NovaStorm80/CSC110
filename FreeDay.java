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

		System.out.println("\nWith the predicted temperature of: " + temp);
		System.out.println("This program suggests");

		//if statements
		if (temp >= 70)

			if (likeWater.equalsIgnoreCase(water))
				System.out.println("\t\t It's great weather for a boat"
														+ " ride");
		else

		if (temp < 70)

			if (temp >= 55)
				{
				if (likeActive.equalsIgnoreCase(active))
					System.out.println("\t\t Tennis will keep you energized");

				else
					System.out.println("\t\t It is a nice day to watch"
							+ " a local sporting event");
				}

		else
			{
			if (temp < 55)

				if (likeActive.equalsIgnoreCase(active))
					System.out.println("\t\t Try a quick paced walk (or jog)"
							+ " in this brisk air");
				else
					System.out.println("\t\tMake a cup of hot cider and"
								+ " put up your feet");
		 	}
	}
}
