package com.company.insaneSevens;

import com.company.Console;
import com.company.actors.Player;
import com.company.decks.DeckI;
import com.company.decks.StandardDeck;

import java.util.ArrayList;
import java.util.List;

public class InsaneSevens {
    List<Hand> hands = new ArrayList<>();
    DeckI deck;
    Card activeCard;
    int turnCounter;

    public InsaneSevens() {
    }

    public void setup() {
        addPlayers();
        deck = new StandardDeck();
        deck.shuffle();
        activeCard = deck.deal();
    }

    public void addPlayers() {
        int playerCount = Console.getInt(1, 5,
                "Enter amount of players 1-5", "Invalid Selection");
        for (int i = 0; i < playerCount; i++) {
            hands.add(new Hand(
                    new Player(Console.getString("Enter Name", true),
                            Console.getString("Enter Color", true))));
        }
    }

    private Hand activeHand() {
        return hands.get(turnCounter);
    }

    public void startRound() {
        draw();
        while (turn(activeHand())) {
            passTurn();
        }
        endRound();

    }

    public void draw() {
        System.out.println("Drawing...");
        for (int i = 0; i < 5; i++) {
            hands.forEach(hand -> hand.draw(deck.deal()));
        }
    }

    public boolean turn(Hand activeHand) {
        activeHand.displayHand();
        System.out.printf("ActiveCard %s\n", activeCard);

        int choice = activeHand.getSelection(activeCard);
        if (choice == 0) {
            activeHand.draw(deck.deal());
        } else {
            Card card = activeHand.takeCard(choice - 1);
            if (card.rank.equals("7")) {
                activeCard = new Card("7",
                        Card.suits.get(
                                Console.getInt(1, 4, "Select suit 1-4 " + Card.suits, "Invalid Selection") - 1));
            } else {
                activeCard = card;
            }
        }
        return activeHand.getHandValue() != 0;

    }

    private void passTurn() {
        turnCounter++;
        if (turnCounter == hands.size()) {
            turnCounter = 0;
        }
    }

    public void endRound() {
        Hand winner = null;
        int points = 0;
        for (Hand hand : hands) {
            hand.displayHand();
            if (hand.getHandValue() == 0) {
                winner = hand;
            }
            points += hand.getHandValue();
        }
        assert winner != null;
        winner.win(points);
        System.out.printf("The winner is: %s\tpoints earned this round: %s\ttotal score: %s\n",
                winner.getName(), points, winner.getScore());
    }

}
