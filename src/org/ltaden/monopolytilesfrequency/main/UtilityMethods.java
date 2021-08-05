package org.ltaden.monopolytilesfrequency.main;

import java.util.List;

/*
 * This class groups together a set of methods that will be used during the game simulation
 * */

public class UtilityMethods {
	
	/* This method will handle card events. To do so, it will need a string representing card effect, and whatever tile player currently stands on
	 * Those tiles are represented as indexes of Tile Arrays - not the cleanest solution, but feels like the easiest to implement
	 * 
	 * */
	public static int cardHandler(String card, int currentTile) {
		if(card.equals("goToStart")) {
			return 0;
		} else if(card.equals("goToJail")) {
			return 10;
		} else if(card.equals("goToTransport1")) {
			return 5;
		} else if(card.equals("goToNavy2")) {
			return 39;
		} else if(card.equals("Red3")) {
			return 24;
		} else if(card.equals("goToPink1")) {
			return 11;
		} else if(card.equals("goToNearestUtility")) {
			/*Utilities are tiles 12 and 28. The best way to determine to which utility should the player go are ranges
			 *  28-12 = 16; divided by 2 is 8, 12 + 8 = 20 - free parking. Therefore, currentTile less or equal 19 should go to Utility1, and
			 *  any other should go to Utility2. Tile 20 is in equal distance from both utilities, but its the parking tile, so who cares.
			 *  Same thing is with start.
			 * */
			if(currentTile <= 19)
				return 12;
			else return 28;
		} else if(card.equals("goToNearestTransport")) {
			//same principle will be applied as in nearest utility - it tile is within first 10, return first transport, and if not, check if its within second 10, then second transport and so on. again, ignoring corners cus they cant cause that event
			if(currentTile <= 9) {
				return 5;
			} else if(currentTile <= 19) {
				return 15;
			} else if(currentTile <= 29) {
				return 25;
			} else
				return 35;
			} else if(card.equals("goBack3Tiles")) {
				if(currentTile - 3 < 0) {
					//if result is negaive, wrap. So if got this card at tile 2, 2-3 = -1 - player should land on tile 39, so its 40 + that negative result.
					return 40+(currentTile - 3);
				} else 
					return currentTile-3;
			} else
				//most likely doNothing cards
				return currentTile;
	}
	
	/*
	 * Handles what happens after dices are thrown. First, checks if doubles counter is 3 - if so, returns 10 immediately - 
	 * player goes to jail. If not, passes sum of currentTile and dices value to wrapping handler to make sure we wont exceed tiles array length
	 * */
	public static int diceTossValidation(int dicesValue, int doublesCounter, int currentTile) {
		if(doublesCounter == 3) {
			return 10;
		} else
			return tileWrappingHandler(currentTile + dicesValue);
			
	}
	
	/*Handles post-throw movement - this methods main function is to make sure that wrapping is done correctly - 
	 * that after tile number 39, comes tile number 0 */
	private static int tileWrappingHandler(int sumOfCurrentTileAndDicesValue) {
		if(sumOfCurrentTileAndDicesValue >=40) {
			return sumOfCurrentTileAndDicesValue -40;
		} else
			return sumOfCurrentTileAndDicesValue;
	}
	
	/*Handles what happens on special tiles - on go to jail tile, and the Chance card tiles*/
	public static int specialTileHandler(Tile[] gameMap, int currentTile, List<String> chanceDeck1, List<String> chanceDeck2) {
		if(gameMap[currentTile].getName().equals("goToJail")) {
			return 10;
		} else if(gameMap[currentTile].getName().startsWith("ChanceType1")) {
			return cardHandler(ChanceCard.pickACard(chanceDeck1), currentTile);
		} else if(gameMap[currentTile].getName().startsWith("ChanceType2")) {
			return cardHandler(ChanceCard.pickACard(chanceDeck2), currentTile);
		} else
			return currentTile;
	}
	
	/*prints the final result of the run*/
	public static void printTheResults(Tile[] array) {
		int total = 0;
		for (Tile tile : array) {
			total += tile.getCount();
		}
		for (Tile tile : array) {
			double percentage = (tile.getCount() * 100.0) / total;
			System.out.print("Tile named " +tile.getName() + " appeared total of " +tile.getCount() + 
					" times (");
			System.out.printf("%.2f", percentage);
			System.out.println("%)");
		}
	}
}
