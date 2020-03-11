import java.util.Random;
import java.util.Scanner;


public class Game {
	
	private static Scanner userchoice;
	private static Scanner gamechoice;
	
	public static void main (String[] args)
	{
		int computer_answers;
		String userplays = "";
		int num_games;
		int user_wins;
		int computer_wins;
		int numOfGames = 0;
		int totUserWins = 0;
		int totCompWins = 0;
		
		num_games = 0;
		
		
		//Starting the game//
		System.out.println("Let's play 'Rock, Paper, Scissors'!");
		
		
		//The game////////////////////////////////////////////////////////////////////////////
		boolean finished;
		finished = false;
		
		while(finished == false)
		{
			user_wins = 0;
			computer_wins = 0;
			boolean gameChoice = true;
			while(gameChoice) {
			System.out.println("What would you like to play? Best of 3, 5, or 7?");
			gamechoice = new Scanner(System.in);
			numOfGames = gamechoice.nextInt();
			if (numOfGames != 3 && numOfGames != 5 && numOfGames != 7) {
				System.out.println("Oops, please choose between 3, 5 and 7: ");
			} else {
				gameChoice = false;
			}
			}
			
				boolean finGame = true;
				while(finGame) {
			
					boolean moveChoice = true;
					while(moveChoice) {
						System.out.println("Rock, paper or scissors?");
						userchoice = new Scanner(System.in);
						userplays = userchoice.next();
						userplays = userplays.toLowerCase();
		
						//If player inputs something other than rock, paper, or scissors//
						if (!userplays.equals("rock") && !userplays.equals("paper") && !userplays.equals("scissors"))
						{
							System.out.println("Error. You did not pick rock, paper or scissors. Please pick again.");
						} else {
							moveChoice = false;
						}
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
		
				System.out.println("The score is You: "+ user_wins + " Computer: " + computer_wins);
				
				int totGames = user_wins + computer_wins;
				if (totGames == numOfGames) {
					finGame = false;
					if (user_wins > computer_wins) {
						totUserWins += 1;
					} else {
						totCompWins += 1;
					}
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
		System.out.println("Game over. You've won " + totUserWins + " game(s) and lost " + totCompWins + " game(s). You have played " + num_games + " rounds.");
		
	}
	
}
