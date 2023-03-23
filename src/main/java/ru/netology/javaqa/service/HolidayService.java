package ru.netology.javaqa.service;

public class HolidayService {

    public int calculate(int income, int expenses, int threshold) {
        int vacations = 0; // количество месяцев отдыха
        int count = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (count >= threshold) { // можем ли отдыхать?
                vacations++; // увеличиваем счётчик месяцев отдыха
                count = (count - expenses) / 3;
            } else {
                count = count + income - expenses;
            }
        }
        return vacations;
    }
}
