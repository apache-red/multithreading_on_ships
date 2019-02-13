package com.redcompany.red.entity;

import com.redcompany.red.behavior.BerthBehavior;

public class Berth implements BerthBehavior {


    private boolean isFree = true;
    private int loadBerth;



    public boolean isFree() {
        return isFree;
    }

    @Override
    public boolean dock(Ship ship) {
        this.isFree = false;
        loadBerth = ship.getLoad();
        ship.setLoad(0);
        return true;
    }

    @Override
    public boolean sail(Ship ship) {
        System.out.println(ship + " был разгружен портом " +Berth.this);
        isFree = true;
        return true;
    }


}
