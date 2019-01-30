package com.redcompany.red.entity;

import java.util.Random;

public class Ship implements Runnable {

    private Random random;
    private int loadCapacity;


    public Ship() {
        initLoadCapacity();


    }

    @Override
    public void run() {

    }


    private void initLoadCapacity() {
        this.random = new Random();
        this.loadCapacity = random.nextInt(11);
    }


}
