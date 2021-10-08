package com.company.games;

import com.company.Color;
import com.company.games.insaneSevens.Card52;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private final Actor player;
    private final List<Card52> card52s = new ArrayList<>();

    public Hand(Actor player) {
        this.player = player;
    }


    public int getHandValue() {
        int handValue = 0;
        for (Card52 card52 : card52s) {
            handValue += card52.value;
        }
        return handValue;
    }

    public int getSelection(Card52 activeCard52) {
        int selection = -1;

        do {
            if (selection != -1) {
                System.out.println("Invalid Card");
            }
            selection = player.getSelection(activeCard52.suit, activeCard52.rank, card52s.size());
            if (selection == 0) {
                break;
            }
            if(card52s.get(selection - 1).rank.equals("7")){
                break;
            }
            if (card52s.get(selection - 1).suit.equals(activeCard52.suit) || card52s.get(selection - 1).rank.equals(activeCard52.rank)) {
                break;
            }
        } while (true);

        return selection;
    }

    public void draw(Card52 card52) {
        card52s.add(card52);
    }

    public String getName() {
        return player.getName();
    }

    public int getScore() {
        return player.getScore();
    }

    public Card52 takeCard(int index) {
        return card52s.remove(index);
    }

    public void displayHand() {
        StringBuilder output = new StringBuilder();
        output.append(Color.getColor(player)).append(player.getName()).append("\n");
        for (Card52 card52 : card52s) {
            output.append(card52).append(" | ");
        }
        output.append("\n");
        output.append(Color.RESET);
        System.out.println(output);
    }

    private void displayCards() {
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
        card52s.clear();
    }
}
