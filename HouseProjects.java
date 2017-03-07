//=========================================================================
//  Author:  Zechariah Ziebart                             csc-111   A
//  Date Due: March. 7, 2017
//  Assign:                                assign-12:Methods-Details
//  Program:   HouseProjects
//  Purpose:
//   Write a program using mutiple methods to create a budget for a house.
//=========================================================================
import java.util.*;
public class HouseProjects
{
	public static void main(String[] args)
	{
		//--Variables
		String rmName  = "";

		double taxRate  = 0,
			   totCarp  = 0,
			   totPaint = 0,
			   carpCst  = 0,
			   galCost  = 0;

		int rooms     = 0,
			paintSqFt = 0;

		Scanner keyboard = new Scanner(System.in);
		//------ main program

		houseIntro();

		System.out.print("Enter the current tax rate\t\t : ");
		taxRate = keyboard.nextDouble();
		System.out.print("Enter the number of rooms in your project: ");
		rooms = keyboard.nextInt();
		System.out.println("");

		for (int cntr = 1; cntr <= rooms; cntr++)
		{
			System.out.println("Provide the following for room-"
													+ cntr + " :");
			System.out.print("\tName of the room\t   :    ");
			rmName = keyboard.next();
			System.out.print("\tPrice of carpet (per sq yd):    ");
			carpCst = keyboard.nextDouble();
			System.out.print("\tPrice for gallon of paint  :    ");
			galCost = keyboard.nextDouble();
			System.out.print("\tSq ft a gal of paint covers:    ");
			paintSqFt = keyboard.nextInt();
			System.out.println("");

			carpCst = calcCarpet(carpCst);
			galCost = calcPaint(galCost, paintSqFt);
			rmSummary(rmName, carpCst,galCost);

			totCarp += carpCst;
			totPaint += galCost;
		}
		projSummary(taxRate, totCarp, totPaint, rooms);
	}//end main

	//=============== House Intro ===========
	public static void houseIntro()
	{
		System.out.println("--- --- Welcome to House Projects --- ---");
		System.out.println("This program will help you budget the house");
		System.out.println("improvement you are planning to do this season.");
		System.out.println("The program will ask you for costs for carpet"
																	+ " and");
		System.out.println("paint you plan on using. Be sure you have that");
		System.out.println("information available");
		System.out.println("");
		return;
	}//end houseIntro()

	//=============== Calculate Carpet ===========
	public static double calcCarpet(double carpCst)
	{
		double area       = 0,
			   totCarpCst = 0;

		//----------- method start

		area = getArea("Floor", 1);
		area = area * .111111;
		totCarpCst = area * carpCst;
		System.out.printf("\t** fyi: SqYds of carpet needed: %.2f", area);
		System.out.println("");
		return totCarpCst;
	}//end calcCarpet()

	//=============== Calculate paint ===========
	public static double calcPaint(double galCost, int paintSqFt)
	{
		int area    = 0;
		double gallons = 0;

		//----------- method start
		System.out.println("");
		area = getArea("Wall-1",2);
		area += getArea("Wall-2",2);
		area = area * 2;
		gallons = area / (double)paintSqFt;

		System.out.printf("\t** fyi: Actual Gallons of paint needed: %.2f \n", gallons);
		gallons = Math.ceil(gallons);
		System.out.printf("\t** fyi: Gallons of paint to purchase: %.0f \n", gallons);
		galCost = galCost * gallons;
		return galCost;
	}//end calcPaint()

	//=============== Room Summary ===========
	public static void rmSummary(String rmName, double carpCst,double galCost)
	{
		double totalCost = 0;

		//----------- method start
		totalCost = carpCst + galCost;
		System.out.println("");
		System.out.println("");
		System.out.println("\t" + rmName + " Costs:");
		System.out.printf("\t\tCarpet:\t\t$  %2.2f\n", carpCst);
		System.out.printf("\t\tPaint :\t\t$  %2.2f\n", galCost);
		System.out.println("\t\t--------------------------------");
		System.out.printf("\t\tRoom Total:\t$ %2.2f\n", totalCost);
		System.out.println("");

		return;
	}//end rmSummary()

	//=============== Project Summary ===========
	public static void projSummary(double taxRate,double totCarp,double totPaint, int rooms)
	{
		double total = 0,
				 tax = 0;

		//----------- method start
		total = totCarp + totPaint;
		tax = total * taxRate;

		System.out.println("> > > > > Project Costs < < < < < <");
		System.out.println("\tNumber of rooms: " + rooms);
		System.out.println("");
		System.out.printf("\t Total Carpet: $  %2.2f\n", totCarp);
		System.out.printf("\t Total Paint : $  %2.2f\n", totPaint);
		System.out.println("\t ----------------------------------");
		System.out.printf("\t     subtotal: $  %2.2f\n", total);
		System.out.printf("\t          tax: $  %2.2f\n", tax);
		System.out.println("\t ==================================");

		total = total + tax;
		System.out.printf("\tTotal Project: $  %2.2f\n", total);
		return;

	}//end projSummary()

	public static int getArea(String msg2, int indicator)
	{
		Scanner keyboard = new Scanner(System.in);
		int area   = 0,
			length = 0,
			width  = 0;

		String msg  = "";

		//----------- method start
		if (indicator == 1)
			msg = "width ";
		else
			msg = "height";

		System.out.print("\tLength of the " + msg2 + "     : ");
		length = keyboard.nextInt();
		System.out.print("\t" + msg + " of the " + msg2 + "     : ");
		width = keyboard.nextInt();

		area = length * width;
		return area;
	}//end getArea()

}// end program


