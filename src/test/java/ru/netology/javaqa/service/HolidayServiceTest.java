package ru.netology.javaqa.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class HolidayServiceTest {
    @ParameterizedTest
    // @CsvSource({
    //       "3, 10000, 3000, 20000",
    //     "2, 100000, 60000, 150000"
    //})
    @CsvFileSource(files = "src/test/resources/vacations.csv")
    public void holidaysFirst(int expected, int income, int expenses, int threshold) {

        HolidayService service = new HolidayService();
        // int income = 10_000;
        // int expenses = 3_000;
        // int threshold = 20_000;
        // int expected = 3;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    // @Test
    void holidaysSecond() {
        HolidayService service = new HolidayService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);


    }

}
