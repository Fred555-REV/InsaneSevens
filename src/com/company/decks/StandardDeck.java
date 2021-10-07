package com.company.decks;

import com.company.insaneSevens.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements DeckI {
    private List<Card> cards = new ArrayList<>();

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
    public int size() {
        return cards.size();
    }

    @Override
    public void changeDeck(List<Card> discard){
        cards.addAll(discard);
        discard.clear();
    }

    @Override
    public Card deal() {
        return cards.remove(cards.size() - 1);
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }
}
