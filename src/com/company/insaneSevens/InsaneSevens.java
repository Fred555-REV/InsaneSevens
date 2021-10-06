package com.company.insaneSevens;

import com.company.decks.Card;
import com.company.decks.DeckI;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InsaneSevens {
    List<Actor> players = new ArrayList<>();
    DeckI deck;
    Card activeCard;
    int turn;

    public InsaneSevens() {
    }

    public void setup() {

    }

    public void startRound() {

    }

    public void draw() {

    }

    public void roundIsNotOver() {

    }

    public void turn(Actor player) {
        System.out.println(activeCard);


    }

    public boolean isValid(Card card) {
        return card.rank == activeCard.rank || card.suit.equals(activeCard.suit);
    }

    public void endRound() {

    }

}
