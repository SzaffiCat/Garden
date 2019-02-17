package hu.szaffi.app;

import hu.szaffi.app.garden.Garden;

public class App {
    public static void main(String[] args) {
        int oneWeekDays = 7;
        Garden garden = new Garden();
        garden.initPlants();
        for (int day = 0; day < oneWeekDays; day++) {
            garden.simulateOneDay();
        }
    }
}
