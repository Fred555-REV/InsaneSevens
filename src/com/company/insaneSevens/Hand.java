package com.company.insaneSevens;

import com.company.Color;

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

    public int getSelection(Card activeCard) {
        int selection = -1;

        do {
            if (selection != -1) {
                System.out.println("Invalid Card");
            }
            selection = player.getSelection(activeCard.suit, activeCard.rank, cards.size());
            if (selection == 0) {
                break;
            }
            if (cards.get(selection - 1).suit.equals(activeCard.suit) || cards.get(selection - 1).rank.equals(activeCard.rank)) {
                break;
            }
        } while (true);

        return selection;
    }

    public void draw(Card card) {
        cards.add(card);
    }

    public String getName() {
        return player.getName();
    }

    public int getScore() {
        return player.getScore();
    }

    public Card takeCard(int index) {
        return cards.remove(index);
    }

    public void displayHand() {
        System.out.println(Color.getColor(player) + player.getName() + ' ');
        for (Card card : cards) {
            System.out.print(card);
            System.out.print(" | ");
        }
        System.out.println(Color.RESET);
    }
    private void displayCards(){
        //TODO make a display card for better visuals
        StringBuilder output = new StringBuilder();
        StringBuilder Top = new StringBuilder();
        StringBuilder Mid = new StringBuilder();
        StringBuilder Bottom = new StringBuilder();
    }

    public void win(int points) {
        player.win(points);
    }

    public void clear() {
        cards.clear();
    }
}
