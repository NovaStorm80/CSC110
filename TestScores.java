import java.util.*;
import java.text.*;
public class TestScores
{
	public static void main(String[] arg)
	{
		//----  declare vars --------
		String  ans = "";

		int  total      = 0,
			 score      = 0,
			 scoreAcum  = 0,
                         lowestScore = 100,
                         highestScore = 0;

	    double scoreAvg = 0;

	    boolean performTask = true;

		Scanner keyboard = new Scanner(System.in);

		DecimalFormat df1 = new DecimalFormat ("##0.0");

		//-------- start up routine-------------
		System.out.println(" * * * Welcome to Test Scores * * *");

			//----------- starting my task ---------------------
			while (performTask)
			{
				System.out.print("Begin entering test scores <when done, enter -1> :");
				score = keyboard.nextInt();

				while(score >= 0 )
						{
							// place highest score
                                                        if (score > highestScore){
                                                            highestScore = score;
                                                        }
                                                        // place lowest score
                                                        if (score < lowestScore){
                                                            lowestScore = score;
                                                        }
                                                        total += score;
							score = keyboard.nextInt();
							scoreAcum ++;
						}//  end SENTINEL control
			//---------- Calculations
			scoreAvg = total / scoreAcum;

			//---------- End Task
			System.out.println("\nNum of Scores:          " + scoreAcum);
			System.out.println("Average Score:          " + df1.format(scoreAvg));
			System.out.println("Lowest Score:            " +  lowestScore);
			System.out.println("Highest Score:          " +  highestScore);

			//--------------step 3:  update control var -----------
			System.out.print("\nWould you like to process more tests(y/n)?");
			ans = keyboard.next();

			if (ans.equalsIgnoreCase("y") )
							System.out.println("==================================="
							+ "===================================");
						else
				performTask = false;
			}// end loop



		} // end main
}// end pgm
