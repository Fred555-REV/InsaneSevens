package com.company.games.uno;

import com.company.decks.Card;

import java.util.List;

public class UnoCard extends Card {
    public static List<String> ranks = List.of(
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
    public UnoCard(String rank, String suit) {
        super(rank, suit);
    }

    @Override
    public int getValue(String rank) {
        return 0;
    }

    @Override
    public String getColor(String suit) {
        return null;
    }
}
