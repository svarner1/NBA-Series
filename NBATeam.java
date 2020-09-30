//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 6
//=======================================

import java.util.Arrays;

//The NBATeam class sets the value of needed variables to determine the winner and losers of a number of basketball games, along with an array that holds the team players. It also determines the number of wins and losses a team has
public class NBATeam {
	private String sTeamName;
	private int nWin;
	private int nLoss;
	private String [] playerArray;
	
	//This constructor sets the team name, number of wins, and number of losses. It also creates the array of players
	public NBATeam(String s) {
		sTeamName = s;
		nWin = 0;
		nLoss = 0;
		playerArray = new String[0];
	}
	
	//This adds to a teams' number of wins
	public static void winAGame(NBATeam winner) {
		winner.nWin += 1;
	}
	
	//This adds to a team's number of losses
	public static void lossAGame (NBATeam loser) {
		loser.nLoss += 1;
	}
	
	//This method adds to the playerArray
	public void addAPlayer(String name) {
		//arrayLength is equal to the playerArray length
		int arrayLength = playerArray.length;
		//The tempArray is created with the same length of the playerArray
		String[] tempArray  = new String [arrayLength];
		//If the length is longer than 0 this code is run
		if(arrayLength > 0) {
			//The tempArray values are set to the values of the playerArray
			for(int i = 0; i< arrayLength; i++) {
				tempArray[i] = playerArray[i];
			}
			//The player array is given a longer length and reinitialized
			playerArray = new String[playerArray.length + 1];
			//The playerArray values are set to the ones stored in the temp
			for(int j = 0; j <playerArray.length - 1; j++) {
				playerArray[j] = tempArray[j];
			}
			//The input name is given to the last value
			playerArray[playerArray.length - 1] = name;
		} 
		//This code runs when the playersArray is first created (the first input of the user) 
		else {
			playerArray = new String [1];
			playerArray[0] = name;
		}
		
	}
	//The toString() method print the final game results
	public String toString() {
		return sTeamName + Arrays.deepToString(playerArray) + " win #: " + nWin + " loss: " + nLoss;
	}
	
	
}
