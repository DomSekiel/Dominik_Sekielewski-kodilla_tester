package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTestSuite {

    private Bank bank;

    @BeforeEach
    void setUp() {
        bank = new Bank();
    }

    @Test
    void shouldReturnCorrectTotalBalance() {
        CashMachine cashMachine1 = new CashMachine();
        cashMachine1.addTransaction(100);
        cashMachine1.addTransaction(-50);

        CashMachine cashMachine2 = new CashMachine();
        cashMachine2.addTransaction(200);

        bank.addCashMachine(cashMachine1);
        bank.addCashMachine(cashMachine2);

        assertEquals(250, bank.getTotalBalance());
    }

    @Test
    void shouldCountDepositsAndWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-30);

        bank.addCashMachine(cashMachine);

        assertEquals(2, bank.getNumberOfDeposits());
        assertEquals(2, bank.getNumberOfWithdrawals());
    }

    @Test
    void shouldCalculateAverageDepositAndWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-200);

        bank.addCashMachine(cashMachine);

        assertEquals(200, bank.getAverageDeposit());
        assertEquals(-200, bank.getAverageWithdrawal());
    }

    @Test
    void shouldReturnZeroWhenNoTransactions() {
        assertEquals(0, bank.getAverageDeposit());
        assertEquals(0, bank.getAverageWithdrawal());
    }
}