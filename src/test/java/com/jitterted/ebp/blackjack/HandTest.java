package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandTest {

    @Test
    public void handWithCardsAddingUpTo22IsBusted() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("9", "8", "5");

        assertThat(hand.isBusted())
                .isTrue();
    }

    @Test
    public void handWithCardsAddingUpTo21IsNotBusted() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("9", "7", "5");

        assertThat(hand.isBusted())
                .isFalse();
    }

    @Test
    public void handWithCardsAddingUpTo20IsNotBusted() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("Q", "K");

        assertThat(hand.isBusted())
                .isFalse();
    }
}
