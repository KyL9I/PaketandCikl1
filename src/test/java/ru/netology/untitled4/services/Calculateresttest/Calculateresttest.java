package ru.netology.untitled4.services.Calculateresttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.untitled4.services.Calculaterest;


public class Calculateresttest {

    @Test
    public void testCalculateMonthRest1() {
        Calculaterest service = new Calculaterest();

        int expected = 3;
        int actual = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateMonthRest2() {
        Calculaterest service = new Calculaterest();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
