package ru.company.building;

import ru.company.Color;

public class Hse implements ExpensiveBuilding {

    Color color = Color.GRAY;

    @Override
    public void setColor(Color color) {
        this.color = color;
        System.out.println("Покрашена вышка в цвет " + color.name());
    }
}
