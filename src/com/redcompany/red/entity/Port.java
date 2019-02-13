package com.redcompany.red.entity;

import java.util.ArrayList;

public class Port {

    private Berth berth;
    private Ship ship;
    private FleetOfShips fleetOfShips;
    private ArrayList<Berth> berthArrayList = new ArrayList<Berth>();


    public void createBerth() {
        this.berth = new Berth();
        addBerthtoberthArrayList(berth);
    }

    private void addBerthtoberthArrayList(Berth berth) {
        berthArrayList.add(berth);
    }

    public void workPort(FleetOfShips fleetOfShips) {
    this.fleetOfShips = fleetOfShips;
        while (fleetOfShips.getSizeFleetOfShips() > 0) {

            st:
            for (int i = 0; i <= berthArrayList.size(); i++) {


                if (berthArrayList.get(i).isFree() == true) {
                    getShipFromFleetOfShipsArrayList();
                    this.berth = berthArrayList.get(i);

                    if (berth.dock(ship) == true) {
                        berth.sail(ship);
                    }
                    break st;

                }
            }
        }
    }

    private void getShipFromFleetOfShipsArrayList() {
        if (fleetOfShips.getSizeFleetOfShips() > 0) {
            this.ship = fleetOfShips.getShipArrayList().get(0);
            fleetOfShips.getShipArrayList().remove(0);
        }
    }


}
