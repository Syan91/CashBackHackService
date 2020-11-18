package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTestAPIJUnitJupiter {
    @Test
    public void shouldReturnThousandIfAmountIsZero(){
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateRemainder(){
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900 ;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnZeroIfAmountIsEqualBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0 ;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateIfAmountLessThanBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1 ;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateIfAmountMoreThanBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999 ;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldCalculateIfAmountIsMinusOne(){
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001 ;
        assertEquals(expected, actual);
    }
}

