package com.jitterted.ebp.blackjack;

import java.util.List;

public enum Suit {
    SPADES("♠"),
    DIAMONDS("♦"),
    HEARTS("♥"),
    CLUBS("♣")
    ;

    static final List<String> SUITS = List.of("♠", "♦", "♥", "♣");
    private String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    // SCAFFOLDING
    @Deprecated
    public static Suit from(String symbol) {
        for (Suit suit : values()) {
            if (symbol.equals(suit.symbol)) {
                return suit;
            }
        }
        return null;
    }

    public String symbol() {
        return symbol;
    }
}
