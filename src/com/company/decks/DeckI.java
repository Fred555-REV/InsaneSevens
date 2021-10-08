package com.company.decks;

import com.company.games.insaneSevens.Card52;

import java.util.List;

public interface DeckI {

    Card52 deal();
    int size();
    void addDeck(List<Card52> discard);
    void shuffle();
}
