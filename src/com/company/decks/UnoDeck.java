package com.company.decks;

import com.company.games.insaneSevens.Card52;
import com.company.games.uno.Uno;
import com.company.games.uno.UnoCard;

import java.util.ArrayList;
import java.util.List;

public class UnoDeck implements DeckI {
    List<UnoCard> cards = new ArrayList<>();

    public UnoDeck() {
        addCards();
    }

    private void addCards() {
        for (String suit : Card52.suits) {
            for (String rank : Card52.ranks) {
                cards.add(new UnoCard(rank, suit));
            }
        }
    }
    @Override
    public Card52 deal() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addDeck(List<Card52> discard) {

    }

    @Override
    public void shuffle() {

    }
}
