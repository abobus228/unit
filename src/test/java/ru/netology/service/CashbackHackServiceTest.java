package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountForBonuses() {

        CashbackHackService service = new CashbackHackService();

        int actual = 50;
        int expected = service.remain(950);

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnAmountForBonusesAfter1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = 850;
        int expected = service.remain(1150);

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturnSum1000At1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = 0;
        int expected = service.remain(1000);

        assertEquals(actual, expected);

    }
}