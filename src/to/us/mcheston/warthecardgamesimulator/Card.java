package to.us.mcheston.warthecardgamesimulator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * This class will build each card object.
 * stores card rank and suit and handle the setting and getting of info.
 */
public class Card {
	private List<Character> posValue = Arrays.asList('A','2','3','4','5','6','7','8','9','0','J','Q','K');
	private List<Character> posSuit = Arrays.asList('S','H','D','C'); //(S)pades,(H)earts,(D)iamonds,(C)lubs
	
	private Map<String, Character> info = new HashMap<String, Character>(); //official value and suit of card
	
	public Card(char v, char s) {
		//Check if passed parameter is valid
		if(!posValue.contains(v)) {
			throw new IllegalArgumentException(v + " :is not a valid card value"); //throws an exception if check failed
		}
		//Check if passed parameter is valid
		if(!posSuit.contains(s)) {
			throw new IllegalArgumentException(s + " :is not a valid card suit"); //throws an exception if check failed
		}
		
		info.put("value", v); //assign v to info with key "value"
		info.put("suit", s); //assign s to info with key "suit"
	}
	
	public void setInfo(char v, char s) {
		//Check if passed parameter is valid
		if(!posValue.contains(v)) {
			throw new IllegalArgumentException(v + " :is not a valid card value"); //throws an exception if check failed
		}
		//Check if passed parameter is valid
		if(!posSuit.contains(s)) {
			throw new IllegalArgumentException(s + " :is not a valid card suit"); //throws an exception if check failed
		}
		
		info.put("value", v); //assign v to info with key "value"
		info.put("suit", s); //assign s to info with key "suit"
		
	}
	
	public Map<String, Character> getInfo(){
		return info;
	}
}
