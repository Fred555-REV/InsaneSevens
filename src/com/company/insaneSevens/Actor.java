package com.company.insaneSevens;

public interface Actor {
    int getScore();

    String getName();

    String getColor();

    int getAction(String suit, String rank); //return 0 for draw or the index+1 of card that you want to play

    void win();

}
