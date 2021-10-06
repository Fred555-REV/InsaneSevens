package com.company.actors;

import com.company.Color;
import com.company.decks.Card;
import com.company.insaneSevens.Actor;
import com.company.insaneSevens.Hand;

import java.util.ArrayList;
import java.util.List;

public class Player implements Actor {
    String name;
    String color;
    int score;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getAction(String activeSuit, String activeRank) {

        return 0;
    }

    private void displayAvailableActions(){
//        System.out.println("(0) Draw");
    }



    @Override
    public void win() {

    }
}
