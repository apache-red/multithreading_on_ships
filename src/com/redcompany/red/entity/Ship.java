package com.redcompany.red.entity;

public class Ship  {

    private int load =100;

    private boolean shipUnloading = false;

    public boolean isShipUnloading() {
        return shipUnloading;
    }

    public void setShipUnloading(boolean shipUnloading) {
        this.shipUnloading = shipUnloading;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }
}
