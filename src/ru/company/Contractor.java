package ru.company;

import ru.company.building.Building;

import java.util.ArrayList;


public class Contractor <T extends Building> {

    private final ArrayList<T> paintedBuildings = new ArrayList<>();

    public void paint(Color color, T building) {
        building.setColor(color);
        paintedBuildings.add(building);
    }

    public ArrayList<T> getPaintedBuildings() {
        return paintedBuildings;
    }
}
