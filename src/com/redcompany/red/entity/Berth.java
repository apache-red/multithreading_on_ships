package com.redcompany.red.entity;

import com.redcompany.red.behavior.BerthBehavior;

public class Berth implements BerthBehavior, Runnable {


    private  boolean isFree = true;
    private int loadBerth;
    private Ship ship;


    public boolean isFree() {
        return isFree;
    }

    @Override
    public void run() {


        dock(ship);
        sail(ship);


    }


    @Override
    public boolean dock(Ship ship) {
        System.out.println("Корабль "+ ship + " поступил на разгрузку в порт " + Berth.this);

        this.isFree = false;
        loadBerth = ship.getLoad();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ship.setLoad(0);
        return true;
    }

    @Override
    public boolean sail(Ship ship) {
        System.out.println(ship + " был разгружен портом " + Berth.this);
        isFree = true;
        return true;
    }

    @Override
    public void getShip(Ship ship) {
        this.ship = ship;
    }


}
