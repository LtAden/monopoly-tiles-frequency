package org.ltaden.monopolytilesfrequency.main;

public class Dice {
	
	/*Rolls two dices like in regular Monopoly game. If results on both dices is the same, doubles counter increases by one. 
	 * Otherwise, its set to 0. Then it returns sum of dice values*/
	public static int rollTheDice(int doublesCounter) {
		  int dice1=(int)(Math.random()*6+1); 
		  int dice2=(int)(Math.random()*6+1); 
		  if(dice1 == dice2) {
			  doublesCounter+=1;
		  } else
			  doublesCounter = 0;
		  return dice1+dice2;
	}
}
