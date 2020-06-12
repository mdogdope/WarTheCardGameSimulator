package to.us.mcheston.warthecardgamesimulator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * This class will build each player object.
 * Tracks the cards and number of cards in players hand.
 * Will also handle the taking and giving of cards.
 */
public class Player {
	//ID tracking
	private static final AtomicInteger count = new AtomicInteger(0); //The "static final" declaration makes this variable keep its value when creating new objects.
	//player attributes
	private String name;
	private Integer id; //The Id number for each player
	private List<Card> hand; //This List will be the players hand.
	
	//A constructor for the class for players with no name sent.
	public Player() {
		this.id = count.incrementAndGet();
		this.name = "player" + this.id.toString();
	}
	
	//A constructor for the class, that lets user set the name.
	public Player(String name) {
		this.name = name;
		this.id = count.incrementAndGet();
	}
	
	//method to add cards to player's hand in random order.
	public void addToHand(List<Card> cardsToAdd) {
		Random rand = new Random(); //Sets up the random number genrator.
		//this loop adds all the cards from cardsToAdd and randomly selects the order to add them to the end of List hand(the bottom the the deck).
		while(!cardsToAdd.isEmpty()) {
			int index = rand.nextInt(cardsToAdd.size());
			this.hand.add(cardsToAdd.get(index));
			cardsToAdd.remove(index);
		}
	}
	
	//method to play cards 
	public List<Card> play(Integer count){
		List<Card> rCards = new ArrayList<Card>(); //Create a new list to put the pulled cards into.
		//A loop that will copy the top card(index 0) from the List hand, and add it to the end of List rCards. Then remove the coppied card from List hand.
		for(int i0 = 0; i0 < count; i0++) {
			rCards.add(hand.get(0));
			hand.remove(0);
		}
		return rCards;
	}
	
	//Method to return the count of cards in hand
	public Integer getHandSize() {
		return hand.size();
	}
	
	public String getName(){
		return this.name;
	}
	
	public Integer getId() {
		return this.id;
	}
}
