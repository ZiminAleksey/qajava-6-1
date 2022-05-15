package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double average(int[] sales) {
        int sum = 0;
        int sumi = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sumi < sales.length) {
                sumi++;
            }
        }
        for (int sale : sales) {
            sum += sale;
        }
        return sum / sumi;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowAverage(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / 12;
        for (int sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int upperAverage(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int average = sum / 12;
        for (int sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}
