package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationPlanningServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.scv")
    public void CalculateWithPackOfData(int income, int expenses, int threshold, int expected) {
        VacationPlanningService service = new VacationPlanningService();

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
