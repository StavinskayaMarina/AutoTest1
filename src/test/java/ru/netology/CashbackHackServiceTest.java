package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(200);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test
    public void remainLargeAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1300);
        int expected = 700;

        assertEquals(expected, actual);
    }

    @Test
    public void remainEqualAmount() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }


}