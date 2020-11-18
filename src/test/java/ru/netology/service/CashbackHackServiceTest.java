package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void shouldReturnThousandIfAmountIsZero(){
       CashbackHackService service = new CashbackHackService();
       int amount = 0;
       int actual = service.remain(amount);
       int expected = 1000;
       assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldCalculateRemainder(){
        CashbackHackService service = new CashbackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900 ;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldReturnZeroIfAmountIsEqualBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0 ;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldCalculateIfAmountLessThanBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1 ;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldCalculateIfAmountMoreThanBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999 ;
        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void shouldCalculateIfAmountIsMinusOne(){
        CashbackHackService service = new CashbackHackService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001 ;
        assertEquals(actual, expected);
    }

}