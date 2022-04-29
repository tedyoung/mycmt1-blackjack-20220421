package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance;

    public Wallet() {
        balance = 0;
    }

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireGreaterThanZero(amount);
        balance += amount;
    }

    public int balance() {
        return balance;
    }

    public void bet(int betAmount) {
        requireSufficientBalanceFor(betAmount);
        balance -= betAmount;
    }

    private void requireSufficientBalanceFor(int betAmount) {
        if (betAmount > balance) {
            throw new IllegalStateException();
        }
    }

    private void requireGreaterThanZero(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }


}
