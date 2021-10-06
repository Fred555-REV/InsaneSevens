package com.company.decks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements DeckI {
    List<Card> cards = new ArrayList<>();

    public StandardDeck() {
        addCards();
    }

    private void addCards() {
        for (String suit : Card.suits) {
            for (String rank : Card.ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    @Override
    public Card deal() {
        return cards.remove(cards.size()-1);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
