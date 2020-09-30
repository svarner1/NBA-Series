//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 6
//=======================================

import java.util.*;

/*
 * This program creates two objects of basketball teams and runs seven games. 
 * The teams' number of wins and losses are printed along with an array that holds the given team players' names.
 */
public class NBA {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		//Two string variables are created
		String ifAddPlayer;
		String playerName;


		//construct Team Heat

		System.out.println("Create the NBA team of Heat ...... ");
		//Creates the heat team
		NBATeam heat= new NBATeam("Heats");
		//Asks user if they would like to add a player to their team
		System.out.print("Add a play to Heats (yes/no): ");
		ifAddPlayer= input.next();

		//The user is repeatedly asked if there answers continue to be yes
		while (ifAddPlayer.equalsIgnoreCase("yes")){
			System.out.print("What is the name to be added? ");
			playerName = input.next();
			//The addAPlayer() method is called if needed
			heat.addAPlayer(playerName);
			System.out.print("Add one more play to Heat? (yes/no): ");
			ifAddPlayer= input.next();
		}
		
		//construct team spurs
		
		System.out.println("Create the NBA team of Spurs ...... ");
		//This created the spurs team
		NBATeam spurs= new NBATeam("Spurs");
		//The user is asked is they want to add a player
		System.out.print("Add a play to Spurs? (yes/no): ");
		ifAddPlayer= input.next();

		//The user continually adds players while their answer is yes
		while (ifAddPlayer.equalsIgnoreCase("yes")){
			System.out.print("What is the name to be added? ");
			playerName = input.next();
			spurs.addAPlayer(playerName);
			System.out.print("Add one more play to Spurs? (yes/no): ");
			ifAddPlayer= input.next();
		}
		
		//This variable is used for the amount of heat wins
		int x = 0;
		//This variable is used for the amount of spurs wins
		int y = 0;
		boolean winnerFound = false;
		
		Random rand = new Random();
		//Games are played until one of the teams reaches 4 wins
		while (winnerFound == false) {
			//The double game result is set to a random number
			double gameResult = rand.nextDouble();
			//If the number is greater than 0.5 the heat wins and the spurs lose, otherwise vice versa is true
			if (gameResult > 0.5) {
				//The corresponding methods are called to add the wins and losses
				NBATeam.winAGame(heat);
				x++;
				NBATeam.lossAGame(spurs);
			}
			else {
				NBATeam.lossAGame(heat);
			    y++;
				NBATeam.winAGame(spurs);
			}
			if(x == 4) {
				winnerFound = true;
			}
			else if (y == 4) {
				winnerFound = true;
			}
		}
		
		//The winner is printed
		if(x >= 4) {
			System.out.println("Heat ***WIN the series***");
		}
		else {
			System.out.println("Spurs ***WIN the series***");
		}
		
		//This prints out the final results
		System.out.println(heat.toString());
		System.out.println(spurs.toString());
	}
}
