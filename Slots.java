//======================================================================
//  Author:   Zechariah Ziebart                             csc-111   A
//  Date Due: Feb. 9, 2017
//  Assign:           assign-05:  Applicatons Review
//  Program:   Slots
//  Purpose:
//    Creating a slot machine using random number generation
//======================================================================
import java.util.*;            // Scanner
public class Slots
{
	public static void main(String[] arg)
	{
		//---------- declare vars----------------------
		int		upperLim 	= 5,
				num         = 0,
				same        = 0,
				sameC       = 0,
				sameO       = 0,
				sameP       = 0,
				sameB       = 0,
				sameM       = 0,
				sameR       = 0,
		        cntNum		= 0,
		        numOfNum	= 5,
		        randNum		= 0;

		double  money       = 0,
		        bet         = 0;

		String  msg = "",
		     answer = "";

		boolean play = true;

		Scanner keyboard = new Scanner(System.in);
		Random rn = new Random();

		//--------   Welcome and Get Inpu ----------
		System.out.println("\t * * *  Welcome to Number generator * * * ");
		System.out.println("");
		System.out.print("Enter amount of money to play: ");
		money = keyboard.nextInt();

 		while (play)
 		{
			System.out.println("");
			System.out.print("Enter your bet: ");
			bet = keyboard.nextInt();
			//------- Validation
			while (bet > money)
			{
				System.out.println("\tInvalid bet of : " + bet);
				System.out.println("\tFunds Available: " + money);
				System.out.print("\tRe-enter bet   : ");
				bet = keyboard.nextInt();
			}
			cntNum = 0;
			while (cntNum  < numOfNum)
			{
					randNum = rn.nextInt(upperLim) + 1;
					// random generation for slot machine
					switch (randNum)
					{
						case 0:
						msg = "Cherries";
						num = 0;
						break;

						case 1:
						msg = "Oranges";
						num = 1;
						break;

						case 2:
						msg = "Plums";
						num = 2;
						break;

						case 3:
						msg = "Bells";
						num = 3;
						break;

						case 4:
						msg = "Melons";
						num = 4;
						break;

						default:
						msg = "Bars";
						num = 5;
					}// switch slot end

					switch (num)// tallying matches
					{
						case 0:
						sameC += 1;
						break;

						case 1:
						sameO+= 1;
						break;

						case 2:
						sameP+= 1;
						break;

						case 3:
						sameB+= 1;
						break;

						case 4:
						sameM+= 1;
						break;

						default:
						sameR+= 1;

					}// end switch that tallys matches

					//finding the greatest match
					if (sameC > same)
						same = sameC;

					if (sameO > same)
						same = sameO;

					if (sameP > same)
						same = sameP;

					if (sameB > same)
						same = sameB;

					if (sameM > same)
						same = sameM;
					if (sameR > same)
						same = sameR;

					System.out.print("\t" + msg);
					cntNum++;
			}// inner while
		// ------- processes for finding bet winnings
			switch (same)
			{
				case 3:
				bet = bet * 2;
				money += bet;
				break;

				case 4:
				bet = bet * 3;
				money += bet;
				break;

				case 5:
				bet = bet * 4;
				money += bet;
				break;

				default:
				money = money - bet;

			}

			//----- output after random numbers
			if (same > 2)
				System.out.println("\n\nyou WIN: " + bet);

			else
			{
				System.out.println("\n\nNo matches, sorry you lost");
				System.out.println("");
			}

			if (money == 0)
			{
				System.out.println("> > > You ran out of money. < < <");
				System.out.println("");
				System.out.println("Restart the game to play again");
				play = false;
			}// end if

			else
			{
				System.out.println("Available money : " + money);
				System.out.println("");
				System.out.print("would you like to play again?(y/n): ");
				answer = keyboard.next();

				//------- boolean logic play continues
				if (answer.equalsIgnoreCase("n"))
				play = false;
			}// end else
		//--- reseting all variables for matches
		same = 0;
		sameC = 0;
		sameO = 0;
		sameP = 0;
		sameB = 0;
		sameM = 0;
		sameR = 0;

		}// outer while

		//------------- ending messages --------------------
		System.out.println("Game over, cash out: " + money);
		System.out.println("");
		System.out.println("Thanks for playing the SLOTs"  );
	}// end main()
} // end pgm

