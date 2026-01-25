package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachines = new CashMachine[0];

    public void addCashMachine(CashMachine cashMachine) {
        CashMachine[] newCashMachines = new CashMachine[cashMachines.length + 1];
        System.arraycopy(cashMachines, 0, newCashMachines, 0, cashMachines.length);
        newCashMachines[newCashMachines.length - 1] = cashMachine;
        cashMachines = newCashMachines;
    }

    public int getTotalBalance() {
        int total = 0;
        for (CashMachine cashMachine : cashMachines) {
            total += cashMachine.getBalance();
        }
        return total;
    }

    public int getNumberOfWithdrawals() {
        return countTransactions(false);
    }

    public int getNumberOfDeposits() {
        return countTransactions(true);
    }

    public double getAverageWithdrawal() {
        return calculateAverage(false);
    }

    public double getAverageDeposit() {
        return calculateAverage(true);
    }

    private int countTransactions(boolean deposits) {
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (deposits && transaction > 0 || !deposits && transaction < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    private double calculateAverage(boolean deposits) {
        int sum = 0;
        int count = 0;

        for (CashMachine cashMachine : cashMachines) {
            for (int transaction : cashMachine.getTransactions()) {
                if (deposits && transaction > 0 || !deposits && transaction < 0) {
                    sum += transaction;
                    count++;
                }
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }
}