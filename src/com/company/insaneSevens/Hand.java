package com.company.insaneSevens;

import com.company.Color;
import com.company.decks.Card;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    Actor player;
    List<Card> cards = new ArrayList<>();

    public Hand(Actor player) {
        this.player = player;
    }


    public int getHandValue() {
        int handValue = 0;
        for (Card card : cards) {
            handValue += card.value;
        }
        return handValue;
    }

    public int getAction(Card activeCard) {
        return player.getAction(activeCard.suit, activeCard.rank);
    }

    public void draw(Card card) {
        cards.add(card);
    }


    public Card takeCard(int index) {
        return cards.remove(index);
    }

    public void displayHand() {
        System.out.println(Color.getColor(player) + player.getName());
        cards.forEach(System.out::print);
        System.out.println(Color.RESET);
    }
}
