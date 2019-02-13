package com.redcompany.red.entity;

import java.util.ArrayList;

public class FleetOfShips {

    private Ship ship;
    private ArrayList<Ship> shipArrayList = new ArrayList<Ship>();


    public void createShip() {
        this.ship = new Ship();
        addShipToShipArrayList(ship);
    }

    public int getSizeFleetOfShips(){
        return shipArrayList.size();
    }

    private void addShipToShipArrayList(Ship ship) {
        shipArrayList.add(ship);
    }

    public ArrayList<Ship> getShipArrayList() {
        return shipArrayList;
    }
}
