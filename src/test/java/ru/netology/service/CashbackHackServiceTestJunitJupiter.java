package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTestJunitJupiter {

    @Test
    public void shouldReturnAmountForBonusesJunitJupiter() {

        CashbackHackService service = new CashbackHackService();

        int expected = service.remain(950);
        int actual = 50;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnAmountForBonusesAfter1000JunitJupiter() {

        CashbackHackService service = new CashbackHackService();

        int expected = service.remain(1150);
        int actual = 850;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReturnSum0At1000JunitJupiter() {

        CashbackHackService service = new CashbackHackService();

        int expected = service.remain(1000);
        int actual = 0;

        Assertions.assertEquals(expected, actual);
    }
}