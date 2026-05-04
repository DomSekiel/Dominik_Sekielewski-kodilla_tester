package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {

    private int[] transactions = new int[0];

    public void addTransaction(int amount) {
        int[] newTransactions = new int[transactions.length + 1];
        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
        newTransactions[newTransactions.length - 1] = amount;
        transactions = newTransactions;
    }

    public int getBalance() {
        int balance = 0;
        for (int transaction : transactions) {
            balance += transaction;
        }
        return balance;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }

    public int[] getTransactions() {
        return Arrays.copyOf(transactions, transactions.length);
    }
}