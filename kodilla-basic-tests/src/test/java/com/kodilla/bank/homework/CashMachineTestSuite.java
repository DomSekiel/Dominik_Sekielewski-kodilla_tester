package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {

    @BeforeEach
    void setUp() {}
    CashMachine cashMachine = new CashMachine();

    @Test
    void shouldAddTransactionsAndReturnCorrectBalance() {

        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);

        assertEquals(400, cashMachine.getBalance());
    }

    @Test
    void shouldReturnCorrectNumberOfTransactions() {

        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);

        assertEquals(2, cashMachine.getNumberOfTransactions());
    }

    @Test
    void shouldReturnZeroBalanceWhenNoTransactions() {

        assertEquals(0, cashMachine.getBalance());
    }
}