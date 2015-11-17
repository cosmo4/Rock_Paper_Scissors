# Rock Paper Scissors Game
Made in Eclipse using Java code

```Java
import java.util.Random;
import java.util.Scanner;


public class Game {
	
	private static Scanner userchoice;
	
	public static void main (String[] args)
	{
		int computer_answers;
		String userplays;
		int num_games;
		int user_wins;
		int computer_wins;
		
		num_games = 0;
		user_wins = 0;
		computer_wins = 0;
		
		//Starting the game//
		System.out.println("Let's play 'Rock, Paper, Scissors'!");
		
		//The game////////////////////////////////////////////////////////////////////////////
		boolean finished;
		finished = false;
		
		while(finished == false)
		{
			System.out.println("Rock, paper or scissors?");
			userchoice = new Scanner(System.in);
			userplays = userchoice.next();
			userplays = userplays.toLowerCase();
			System.out.println("You picked " + userplays + ".");
		
			//If player inputs something other than rock, paper, or scissors//
			if (!userplays.equals("rock") && !userplays.equals("paper") && !userplays.equals("scissors"))
			{
				System.out.println("Error. You did not pick rock, paper or scissors. Please pick again.");
			}
			
			//Generates computer's choice//
			Random generator = new Random();
			computer_answers = generator.nextInt(2);
		
			//Compares computer's choice when player picks ROCK//
			if (userplays.equals("rock")) 
			{
				if (computer_answers == 0)
				{
					System.out.println("Computer plays rock. It's a tie!");
					num_games = num_games + 1;
				}
				else if (computer_answers == 1)
				{
					System.out.println("Computer plays paper. You lose.");
					num_games = num_games + 1;
					computer_wins = computer_wins + 1;
				}
				else if (computer_answers == 2)
				{
					System.out.println("Computer plays scissors. You win!");
					num_games = num_games + 1;
					user_wins = user_wins + 1;
				}
			}
		
			//Compares computer's choice when player picks PAPER//
			else if (userplays.equals("paper")) 
			{
				if (computer_answers == 0)
				{
					System.out.println("Computer plays rock. You win!");
					num_games = num_games + 1;
					user_wins = user_wins + 1;
				}
				else if (computer_answers == 1)
				{
					System.out.println("Computer plays paper. It's a tie!");
					num_games = num_games + 1;
				}
				else if (computer_answers == 2)
				{
					System.out.println("Computer plays scissors. You lose.");
					num_games = num_games + 1;
					computer_wins = computer_wins + 1;
				}
			}
		
			//Compares computer's choice when player picks SCISSORS//
			else if (userplays.equals("scissors")) 
			{
				if (computer_answers == 0)
				{
					System.out.println("Computer plays rock. You lose.");
					num_games = num_games + 1;
					computer_wins = computer_wins + 1;
				}
				else if (computer_answers == 1)
				{
					System.out.println("Computer plays paper. You win!");
					num_games = num_games + 1;
					user_wins = user_wins + 1;
				}
				else if (computer_answers == 2)
				{
					System.out.println("Computer plays scissors. It's a tie!");
					num_games = num_games + 1;
				}	
			}	
		
		//Player can choose to continue or not//	
		String decision;
		
		System.out.println("Do you want to keep playing? (Y/N)");
		userchoice = new Scanner(System.in);
		decision = userchoice.next();
		decision = decision.toLowerCase();
		
			//If player inputs something other than 'y' or 'n'//
			while (!decision.equals("y") && !decision.equals("n"))
			{
				System.out.println("Error. You did not input 'y' or 'n'.");
				System.out.println("Do you want to keep playing? (Y/N)");
				userchoice = new Scanner(System.in);
				decision = userchoice.next();
				decision = decision.toLowerCase();
				
				if (decision.equals("y"))
				{
					break;
				}
				else if (decision.equals("n"))
				{
					finished = true;
					break;
				}
			}
			
			//If player choose 'n'//
			if (decision.equals("n"))
			{
				break;
			}
		}
		
	//The game ends. Results are provided////////////////////////////////////////////////////
	System.out.println("Game over. You've won " + user_wins + " game(s) and loss " + computer_wins + " game(s) out of a total of " + num_games + " game(s).");
		
	}
	
}
```
