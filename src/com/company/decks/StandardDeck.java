package com.company.decks;

import com.company.insaneSevens.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements DeckI {
    List<Card> cards = new ArrayList<>();

    public StandardDeck() {}

    private void addCards() {
        for (String suit : Card.suits) {
            for (String rank : Card.ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    @Override
    public Card deal() {
        if (cards.size() == 0) {
            addCards();
            shuffle();
        }
        return cards.remove(cards.size() - 1);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
