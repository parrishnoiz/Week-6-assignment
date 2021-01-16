package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List <Card> cards = new ArrayList<Card>();
	
	public Deck() {
		for (int i = 2; i < 15; i++) {
			cards.add(new Card(i, "Diamonds"));
			cards.add(new Card(i, "Hearts"));
			cards.add(new Card(i, "Spades"));
			cards.add(new Card(i, "Clubs"));
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);;
	}
	
	public Card draw() {
		return cards.remove(0);
	}
}
