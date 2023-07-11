package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(200);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainLarge() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1300);
        int expected = 700;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemainEqual() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }
}