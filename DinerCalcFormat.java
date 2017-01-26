//========================================================================
//  Author:   Zechariah Ziebart                             csc-111   A
//  Date Due: Jan. 25, 2017
//  Assign:                       assign-01:  Review Fundamentals/ printf()
//  Program:   DinerCalcFormat
//  Purpose:
//    Review, and learning and testing printf().
//========================================================================
import java.util.*;
public class DinerCalcFormat
{
	public static void main (String[] args)
	{
		// ----------------  constants -------------
		Double item1   	    = 0.0,
			   item2   	    = 0.0,
			   item3   	    = 0.0,
			   subtotal	 	= 0.0,
			   tip     	 	= 0.0,
			   tipCst  	 	= 0.0,
			   tax      	= 0.0,
		       ctsPerPerson = 0.0,
			   total 	    = 0.0;

		Double TAX = 0.0575; //-- supposed to be a final

		// --------- Scanner
		Scanner keyboard = new Scanner(System.in);

		//------------------ startup, welcome, Input -------------------------
		System.out.println("\n * * *  Welcome to Diner Calculator * * *");
		System.out.println("\nThis program calculates how much each person");
		System.out.println("contributes equally to a restaurant bill.");

		System.out.print("\nEnter the tip rate (as a decimal): ");
		tip = keyboard.nextDouble();
		System.out.print("\tEnter menu item-1 cost: $");
		item1 = keyboard.nextDouble();
		System.out.print("\tEnter menu item-2 cost: $");
		item2 = keyboard.nextDouble();
		System.out.print("\tEnter menu item-3 cost: $");
		item3 = keyboard.nextDouble();

		// -------------- process   something  -----------------
		subtotal = (item1 + item2) + item3;
		tax = TAX * subtotal;
		tipCst = tip * subtotal;
		total = (subtotal + tax) + tipCst;
		ctsPerPerson = total / 3;
		TAX = TAX * 100; // not supposed to do this
		tip = tip * 100; // not supposed to do this

		// --------------   output/ end Msg  --------------
		System.out.println("\n\n\t = = = = =  Bill Summary = = = =" );
		System.out.printf("\tMenu item-1 cost:\t $%7.2f\n", item1);
		System.out.printf("\tMenu item-2 cost:\t $%7.2f\n", item2);
		System.out.printf("\tMenu item-3 cost:\t $%7.2f\n", item3);
		System.out.printf("\n\t\tSubtotal:\t $%7.2f\n", subtotal);
		System.out.printf("\t\tTax at %.2f%%:\t $%7.2f\n", TAX, tax);
		System.out.printf("\t\tTip at %.0f%%:\t $%7.2f\n", tip, tipCst);

		System.out.println("--------------------------------------");
		System.out.printf("\t\tTotal:\t\t $%7.2f\n", total);
		System.out.printf("\tCost per person:\t $%7.2f\n", ctsPerPerson);

		System.out.println("\nThank you for using Diner calculator.");

			} // end main
}  //end pgm
