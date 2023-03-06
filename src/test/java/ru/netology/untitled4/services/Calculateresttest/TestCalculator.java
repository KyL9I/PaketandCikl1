package ru.netology.untitled4.services.Calculateresttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.untitled4.services.Calculators;


public class TestCalculator {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/rest.csv")
    public void testCalculateMonthRest(int expected, int income, int expenses, int threshold) {
        Calculators service = new Calculators();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
