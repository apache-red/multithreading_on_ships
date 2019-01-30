package com.redcompany.red.entity;

import java.util.ArrayList;
import java.util.Random;

public class Port {

private int capacity = 1000;
private int numberOfBerths = 3;
private int numberOfShips;
private Random random;
private ArrayList<Berth> berthArrayList;
private ArrayList<Ship> shipArrayList;

private Berth berth ;

    public Port() {
        this.berthArrayList = new ArrayList<Berth>(numberOfBerths-1);
        initBerthList();
        this.shipArrayList = new ArrayList<Ship>();
        initNumberOfShips();




    }

    private void initBerthList(){
        for (int i = 0; i <= numberOfBerths ; i++) {
            berthArrayList.add(new Berth());
        }
    }

    private void   initNumberOfShips(){
        random = new Random();
        numberOfShips = random.nextInt(21);
        for (int i = 0; i <= numberOfShips; i++) {
            shipArrayList.add(new Ship());
        }
    }

}
