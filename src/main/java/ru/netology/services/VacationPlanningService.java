package ru.netology.services;

public class VacationPlanningService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // изменяет сумму с учетом затрат на отдых
            } else {
                money = money + income - expenses; // изменяет сумму на счете с учетом усердной работы
            }
        }
        return count;
    }
}
