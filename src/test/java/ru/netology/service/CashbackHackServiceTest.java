package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldSuggestAdd100() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldSuggestAdd0() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldSuggestAdd1000() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @Test
    public void shouldSuggestAdd1() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual,expected);
    }

    @Test
    public void  shouldSuggestAdd999() {

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual,expected);
    }
}