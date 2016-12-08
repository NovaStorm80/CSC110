import java.util.*;
public class BarChart
{
	public static void main(String[] arg)
	{
		//----- Declared Variables
		String asterix = "*",
			   barLine = "|";


		int  count = 0,
		  numCount = 0,
			sales1 = 0,
			sales2 = 0,
		    sales3 = 0;

		Scanner keyboard = new Scanner(System.in);

		//----- Program Start
		System.out.println("\t* * * Welcome to Sales Bar Chart * * *");
		System.out.print("\nEnter sales for store-1: ");
		sales1 = keyboard.nextInt();
		System.out.print("Enter sales for store-2: ");
		sales2 = keyboard.nextInt();
		System.out.print("Enter sales for store-3: ");
		sales3 = keyboard.nextInt();
		System.out.println("\nSALES BAR CHART");

		//----- Calculations
		System.out.print("Store 1: ");
		while ( numCount <= sales1)
		{
			if (count == 9){
			System.out.print("|");
			 numCount += 100;
			 count = 1;
	       }else
			System.out.print("*");
			 numCount += 100;
			 count ++;
		}// ---- Store Sales 1

		System.out.print("\nStore 2: ");
                numCount = 0; // reset numCount to zero
		while ( numCount <= sales3)
				{
					if (count == 9){
					System.out.print("|");
					 numCount += 100;
					 count = 1;
			       }else
					System.out.print("*");
					 numCount += 100;
					 count ++;
				}// ---- Store Sales 2

		System.out.print("\nStore 3: ");
                numCount = 0; // reset numCount to zero
		while ( numCount <= sales3)
				{
					if (count == 9){
					System.out.print("|");
					 numCount += 100;
					 count = 1;
			       }else
					System.out.print("*");
					 numCount += 100;
					 count ++;
				}// ---- Store Sales 3
	}// --- end main
}// --- end pgm
