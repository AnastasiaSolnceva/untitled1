package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RestCalculationServiceTest {

    @Test
    void shouldRestCalculationService() {
        RestCalculationService service = new RestCalculationService();

        // подготавливаем данные:
        int income = 10000;
        int threshold = 20000;
        int expenses = 3000;


        // вызываем целевой метод:
        int count = service.calculate(income, expenses, threshold);

    }
}