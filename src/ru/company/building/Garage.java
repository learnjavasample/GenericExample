package ru.company.building;

import ru.company.Color;

public class Garage implements Building {

    Color color = Color.GRAY;

    @Override
    public void setColor(Color color) {
        this.color = color;
        System.out.println("Покрашен гараж в цвет " + color.name());
    }
}
