package com.company.actors;

import com.company.Console;
import com.company.insaneSevens.Actor;

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
    public int getSelection(String activeSuit, String activeRank,int handSize) {

        return Console.getInt(0,handSize,
                "Select card to play or enter 0 to draw","Invalid Selection");
    }

    private void displayAvailableActions(){
//        System.out.println("(0) Draw");
    }



    @Override
    public void win(int points) {
        score+=points;
    }
}
