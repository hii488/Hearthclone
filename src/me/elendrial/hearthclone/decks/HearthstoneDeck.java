package me.elendrial.hearthclone.decks;

import java.awt.Point;
import java.util.ArrayList;

import me.elendrial.cardGameBase.cards.StandardCard;
import me.elendrial.cardGameBase.decks.StandardDeck;
import me.elendrial.hearthclone.cardVars.ClassEnum;
import me.elendrial.hearthclone.cards.UnknownCard;

public class HearthstoneDeck extends StandardDeck{

	public String name;
	public String[] cardIDs;
	public ClassEnum deckClass;
	public String ruleSetName;
	public String version;
	
	public HearthstoneDeck(){}
	
	public HearthstoneDeck(int maxDeckSize, ArrayList<StandardCard> cards, Point position, Point size, String cardBackTextureName) {
		super(maxDeckSize, cards, position, size, cardBackTextureName);
	}

	public HearthstoneDeck(int maxDeckSize, ArrayList<StandardCard> cards, Point position, Point size) {
		super(maxDeckSize, cards, position, size);
	}

	public HearthstoneDeck(int maxDeckSize, ArrayList<StandardCard> cards) {
		super(maxDeckSize, cards);
	}

	public HearthstoneDeck(int maxDeckSize) {
		super(maxDeckSize);
	}

	public static HearthstoneDeck getUnknownDeck(int oppDeckSize, int maxDeckSize) {
		ArrayList<StandardCard> udeck = new ArrayList<StandardCard>();
		for(int i = 0; i < oppDeckSize; i++) udeck.add(new UnknownCard());
		
		return new HearthstoneDeck(maxDeckSize, udeck);
	}

}
