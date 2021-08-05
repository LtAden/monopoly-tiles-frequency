package org.ltaden.monopolytilesfrequency.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChanceCard {
	//first, card methods
	/*pick up a card from the top, get its value, then move it to the end - move all previous cards first, 
	 * then add it as the last element, and finally return the held value from original card*/
	public static String pickACard(List<String> deck) {
		String cardValueStorage = deck.get(0);
		for(int i = 1; i < deck.size(); i++) {
			deck.set(i-1, deck.get(i));
		}
		deck.set(deck.size()-1, cardValueStorage);
		return cardValueStorage;
	}
	
	/*
	 * Shuffles a deck of cards to ensure some sort of randomness within decks. Happens only after generation of new deck
	 * */
	private static void shuffleDeck(List<String> deck) {
		Collections.shuffle(deck);
	}
	
	
	//Generating Chance card decks
	
	public static List<String> genrateChanceType1Deck(){
		List<String> result = new ArrayList<String>();
		//Chance type 1 has 16 cards, two of which have some effect
		result.add("goToStart");
		result.add("goToJail");
		//add remaining 14 cards with no effect
		for(int i = 0; i<15; i++) {
			result.add("doNothing");
		}
		shuffleDeck(result);
		return result;
	}
	
	public static List<String> genrateChanceType2Deck(){
		List<String> result = new ArrayList<String>();
		//Type 2 chance card has 10 movement cards
		for(int i = 0; i<7; i++) {
			result.add("doNothing");
		}
		result.add("goToJail");
		result.add("goToStart");
		result.add("goToNearestTransport");
		result.add("goToNearestTransport");
		result.add("goBack3Tiles");
		result.add("goToPink1");
		result.add("goToRed3");
		result.add("goToNavy2");
		result.add("goToNearestUtility");
		result.add("goToTransport1");
		
		shuffleDeck(result);
		return result;
	}
	
}
