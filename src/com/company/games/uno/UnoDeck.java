package com.company.games.uno;

import com.company.decks.Card;
import com.company.decks.DeckI;
import com.company.games.insaneSevens.Card52;

import java.util.ArrayList;
import java.util.List;

public class UnoDeck implements DeckI {
    List<UnoCard> cards = new ArrayList<>();

    public UnoDeck() {
        addCards();
    }

    private void addCards() {
        for (String rank : UnoCard.ranks) {
            switch (rank) {
                case "0":
                case "Re":
                case "Sk":
                case "+2":
                    for (String suit : UnoCard.suits) {
                        //one of each 0 and action card
                        cards.add(new UnoCard(rank, suit));
                    }
                    break;
                default:
                    for (int i = 0; i < 2; i++) {
                        for (String suit : UnoCard.suits) {
                            //8 of each rank
                            //2 for each color
                            cards.add(new UnoCard(rank, suit));
                        }
                        //2 of each wild
                        cards.add(new UnoCard(rank, "Wild"));
                    }
            }
        }
    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void addDeck(List<Card> discard) {

    }

    @Override
    public void shuffle() {

    }
}
