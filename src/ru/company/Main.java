package ru.company;

import ru.company.building.Building;
import ru.company.building.ExpensiveBuilding;
import ru.company.building.Garage;
import ru.company.building.Hse;

public class Main {

    public static void main(String[] args) {

        Hse hse = new Hse();
        Garage garage = new Garage();

        Contractor<Building> commonContractor = new Contractor<>();
        Contractor<ExpensiveBuilding> goodContractor = new Contractor<>();

        commonContractor.paint(Color.RED, hse);    //OK
        commonContractor.paint(Color.RED, garage); //OK

        goodContractor.paint(Color.RED, hse);      //OK
        //goodContractor.paint(Color.RED, garage);   //ERROR
    }
}
