package ru.netology.untitled4.services.Calculateresttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.untitled4.services.Calculaterest;


public class Calculateresttest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void testCalculateMonthRest(int expected, int income, int expenses, int threshold) {
        Calculaterest service = new Calculaterest();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
