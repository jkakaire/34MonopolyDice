/**
 * 
 */

/**
 * @author User
 * Create a program that will randomly select two numbers from 1-6 (like rolling two dice). Show the dice rolls and end the program UNLESS the program rolls doubles. If the program rolls doubles, then it should roll again, show the new roll and stop UNLESS the program rolls doubles again and so on. But on the third time you roll doubles, you don't get to roll again, on the third time you roll doubles, you go to jail!
The program should print the sum of the rolls and indicate if the user should stop or roll again or go to Jail. See the example output below.
 
User rolls  2  &  6
Move 8 Spaces and stop
User rolls  3  &  3
DOUBLES!
Move 6 Spaces and roll again getting...
User rolls 1 & 2
Move 3 Spaces and stop
User rolls  2  &  2
DOUBLES!
Move 4 Spaces and roll again getting...
User rolls 1 & 1
DOUBLES
Move 2 Spaces and roll again getting...
User rolls 6 & 6
DOUBLES
GO TO JAIL --->
 *
 */

import java.util.Random;
public class MonopolyDice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int die1, die2, counter;
		
		counter = 0;
		die1 = rollDie(rnd);
		die2 = rollDie(rnd);
		
		while(die1 == die2)//while startTime == xx
		{
			System.out.printf("User rolls %d & %d%n", die1, die2);
			System.out.println("DOUBLES!");
			counter++;
			if(counter >= 3)
			{
				break; //breaks into outer loop for startTime
			}
			System.out.printf("Move %d spaces and roll again getting .... %n", die1 + die2);
			
			die1 = rollDie(rnd);
			die2 = rollDie(rnd);
		}
		if(counter < 3)
		{
			System.out.printf("User rolls %d & %d%n", die1, die2);
			System.out.printf("Move %d spaces and stop", die1, die2);
		}
		else
		{
			System.out.println("Go eat your chicken in JAIL--->");
		}
	}
	public static int rollDie(Random rnd)
	{
		int dieRoll = 1 + rnd.nextInt(6);
		return dieRoll;
	}
}
