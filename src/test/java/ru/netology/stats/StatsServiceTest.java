package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSalesSum() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.salesSum(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMiddleSale() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.middleSale(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonthSale() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxMonthSale(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinMonthSale() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minMonthSale(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMinSales() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthMinSales(companySales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthMaxSales() {
        StatsService service = new StatsService();
        int[] companySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.monthMinSales(companySales);
        assertEquals(expected, actual);
    }
}