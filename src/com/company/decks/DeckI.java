package com.company.decks;

import com.company.games.insaneSevens.Card52;

import java.util.List;

public interface DeckI {

    Card deal();
    int size();
    void addCards();
    void addDeck(List<Card> discard);
    void shuffle();
}
