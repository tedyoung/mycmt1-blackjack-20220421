package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

    @Test
    public void handWithOneAceAndOtherCardsEqualTo9IsValuedAt11() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "9");

        assertThat(hand.value())
                .isEqualTo(11 + 9);
    }

    @Test
    public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "8", "3");

        assertThat(hand.value())
                .isEqualTo(1 + 8 + 3); // EVIDENT DATA
    }

    @Test
    public void handWithOneAceAndOtherCardsEqualTo10IsValuedAt11() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "8", "2");

        assertThat(hand.value())
                .isEqualTo(11 + 8 + 2);
    }

}
