package Lesson4.HomeWork;

import java.util.Arrays;

public class RailwayStation {
     Train[] trainsList = new Train[3];
     public String stationName;

    public RailwayStation(String stationName) {
        this.stationName = stationName;


    }

    public void setTrain() {
        trainsList[0] = new Train( "Penza - Kazan",30,"passenger");
        trainsList[1] = new Train( "Penza - Sochi",30, "passenger");
        trainsList[2] = new Train( "Penza - Moscow",30, "passenger");


    }


}
