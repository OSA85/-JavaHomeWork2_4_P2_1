package ru.netology.stats;

public class StatsService {

    //    Сумма всех продаж

    public int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    //    Среднюю сумму продаж в месяц

    public int middleSale(int[] sales) {
        return salesSum(sales) / sales.length;

    }

    //   Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)

    public int maxMonthSale(int[] sales) {
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

    //    Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)

    public int minMonthSale(int[] sales) {
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

//    Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)

    public int monthMinSales(int[] sales) {
        int middle = middleSale(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < middle) {
                counter++;
            }
        }
        return counter;
    }

    //    Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

    public int monthMaxSales(int[] sales) {
        int middle = middleSale(sales);
        int counter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > middle) {
                counter++;
            }
        }
        return counter;
    }

}
