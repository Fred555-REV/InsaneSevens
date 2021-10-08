package com.company.decks;

import com.company.insaneSevens.Card;

import java.util.List;

public interface DeckI {

    Card deal();
    int size();
    void addDeck(List<Card> discard);
    void shuffle();
}
