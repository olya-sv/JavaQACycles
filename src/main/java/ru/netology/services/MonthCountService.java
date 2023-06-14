package ru.netology.services;
public class MonthCountService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int balance = 0;
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                count++;
                balance = (balance - expenses) / 3;
            } else {
                balance = (balance + income) - expenses;
            }
        }
        return count;
    }
}



