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
            for (int i = 0; i < berthArrayList.size(); i++) {

                if (berthArrayList.get(i).isFree() == true) {
                    this.berth = berthArrayList.get(i);

                    if (berth.isFree() == true) {
                        ship = getShipFromFleetOfShipsArrayList();
                        if (ship.isShipUnloading() == false){
                            ship.setShipUnloading(true);
                            berth.getShip(ship);
                            Thread myThread = new Thread(berth);
                            myThread.start();
                            try {
                                Thread.currentThread().sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }else {
                        break st;
                    }

                }
            }
        }
    }

    private Ship getShipFromFleetOfShipsArrayList() {
        if (fleetOfShips.getSizeFleetOfShips() > 0) {
            this.ship = fleetOfShips.getShipArrayList().get(0);
            fleetOfShips.getShipArrayList().remove(0);
        }
        return this.ship;
    }


}
