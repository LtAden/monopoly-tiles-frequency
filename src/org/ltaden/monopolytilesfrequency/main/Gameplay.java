package org.ltaden.monopolytilesfrequency.main;

import java.util.List;

public class Gameplay {
	
	public static void runTheGame(int trialTurns) {
		Tile[] gameMap = Tile.generateTiles();
		List<String> chanceDeck1 = ChanceCard.genrateChanceType1Deck();
		List<String> chanceDeck2 = ChanceCard.genrateChanceType2Deck();
		
		int turn = 0;
		int currentTile = 0;
		int doublesCounter = 0;
		int specialTileResult = 0;
		
		while(turn < trialTurns) {
			currentTile = UtilityMethods.diceTossValidation(Dice.rollTheDice(doublesCounter), doublesCounter, currentTile);
			gameMap[currentTile].landedOn();
			
			specialTileResult = UtilityMethods.specialTileHandler(gameMap, currentTile, chanceDeck1, chanceDeck2);
			
			if(specialTileResult != currentTile) {
				currentTile = specialTileResult;
				gameMap[currentTile].landedOn();
			}
			
			
			
			turn++;
		}
		UtilityMethods.printTheResults(gameMap);
		
	}
	
}
