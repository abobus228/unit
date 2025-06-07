package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountForBonuses() {

        CashbackHackService service = new CashbackHackService();

        int expected = service.remain(950);
        int actual = 50;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnAmountForBonusesAfter1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = service.remain(1150);
        int actual = 850;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnSum0At1000() {

        CashbackHackService service = new CashbackHackService();

        int expected = service.remain(1000);
        int actual = 0;

        assertEquals(expected, actual);

    }
}