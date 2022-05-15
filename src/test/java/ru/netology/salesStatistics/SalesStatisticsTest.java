package ru.netology.salesStatistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesStatisticsTest {

    @Test
    public void salesSum() {
        SalesStatistics statistics = new SalesStatistics();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void salesAverage() {
        SalesStatistics statistics = new SalesStatistics();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double actual = statistics.average(sales);
        double expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12; //15
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesMax() {
        SalesStatistics statistics = new SalesStatistics();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesMin() {
        SalesStatistics statistics = new SalesStatistics();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesLowAverage() {
        SalesStatistics statistics = new SalesStatistics();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.lowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void salesUpperAverage() {
        SalesStatistics statistics = new SalesStatistics();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = statistics.upperAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}

