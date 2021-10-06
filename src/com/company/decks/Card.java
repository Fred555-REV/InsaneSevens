package com.company.decks;

import com.company.Color;

import java.util.List;

public class Card {
    public static final List<String> ranks = List.of(
            "A",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "J",
            "Q",
            "K"
    );
    public static final List<String> suits = List.of(
            "C",
            "D",
            "H",
            "S"
    );
    public final String name;
    public final String rank;
    public final String suit;
    public final String color;
    public final int value;
//    protected Card(int rank, String suit) {
//        this.rank = rank;
//        this.suit = suit;
//    }
protected Card(String rank, String suit) {
    this.rank = rank;
    this.suit = suit;
    value = getValue(rank);
    color = getColor(suit);
    name = String.format("%s%s of %s%s",
            Color.getColor(color), rank, suit, Color.RESET);

}
    private int getValue(String rank) {
        switch (rank) {
            case "8":
                return 50;
            case "J":
            case "Q":
            case "K":
                return 10;
            case "A":
                return 1;
            default:
                return Integer.parseInt(rank);
        }
    }

    private String getColor(String suit) {
        switch (suit) {
            case "C":
            case "S":
                return "Black";
            case "H":
            case "D":
                return "Red";
            default:
                return "White";
        }
    }

    @Override
    public String toString() {
        return String.format("%s%s of %s%s\t",
                Color.getColor(color), rank, suit, Color.RESET);
    }
}
