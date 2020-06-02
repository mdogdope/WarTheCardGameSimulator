package to.us.mcheston.warthecardgamesimulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/* 
 * This class will build each deck object.
 * This will set the values of each card and store them in a deck of cards.
 * This class will shuffile the deck and deal the cards out to each player.
 */
public class Deck {
	private List<Character> posRank = Arrays.asList('A','2','3','4','5','6','7','8','9','0','J','Q','K');
	private List<Character> posSuit = Arrays.asList('S','H','D','C'); //(S)pades,(H)earts,(D)iamonds,(C)lubs
	
	private List<Card> deck = new ArrayList<Card>();
	
	
	//Constructor for deck
	public Deck(Integer numOfDecks) {
		for(int i0 = 0; i0 < numOfDecks; i0++) {
			for(int i1 = 0; i1 < posSuit.size(); i1++) {
				for(int i2 = 0; i2 < posRank.size(); i2++) {
					deck.add(new Card(posRank.get(i2), posSuit.get(i1)));
				}
			}
		}
	}
	
	//Shuffles all the card objects in the deck.
	public void shuffle() {
		List<Card> bufferDeck = deck;
		deck.clear();
		Random rand = new Random();
		while(bufferDeck.size() > 0) {
			int randIndex = rand.nextInt(bufferDeck.size());
			deck.add(bufferDeck.get(randIndex));
			bufferDeck.remove(randIndex);
		}
	}
}
