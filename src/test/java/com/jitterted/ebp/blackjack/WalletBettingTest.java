package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletBettingTest {

    @Test
    public void walletWithBalance12WhenBet8ThenBalanceIs4() throws Exception {
        Wallet wallet = createWalletWithAmount(12);

        wallet.bet(8);

        assertThat(wallet.balance())
                .isEqualTo(12 - 8);
    }

    @Test
    public void walletWith27Bet7AndBet9thenBalanceIs11() throws Exception {
        Wallet wallet = createWalletWithAmount(27);

        wallet.bet(7);
        wallet.bet(9);

        assertThat(wallet.balance())
                .isEqualTo(27 - 7 - 9);
    }

    @Test
    public void betFullBalanceThenWalletIsEmpty() throws Exception {
        Wallet wallet = createWalletWithAmount(73);

        wallet.bet(73);

        assertThat(wallet.isEmpty())
                .isTrue();
    }


    private Wallet createWalletWithAmount(int startingAmount) {
        Wallet wallet = new Wallet();
        wallet.addMoney(startingAmount);
        return wallet;
    }


}
