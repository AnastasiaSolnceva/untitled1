package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestCalculationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void shouldRestCalculationServiceTest(int income, int expenses, int threshold, int actual) {
        RestCalculationService service = new RestCalculationService();

        int restMonthCount = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(restMonthCount, actual);


    }
}