package com.redcompany.red.start;

import com.redcompany.red.entity.FleetOfShips;
import com.redcompany.red.entity.Port;

class Main {
    int b;

    public static void main(String[] args) {

       Port port = new Port();
       port.createBerth();
       port.createBerth();
       port.createBerth();

       FleetOfShips fleetOfShips= new FleetOfShips();
       fleetOfShips.createShip();
       fleetOfShips.createShip();
       fleetOfShips.createShip();
       fleetOfShips.createShip();

       port.workPort(fleetOfShips);

    }







}
