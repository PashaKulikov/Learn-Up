package Lesson4.HomeWork;

public class RailwayStation {
    private Train[] trainsList = new Train[3];

    public void setTrain() {
        trainsList[0] = new Train(20, "Kazan", "passenger");
        trainsList[1] = new Train(22, "Sochi", "passenger");
        trainsList[2] = new Train(25, "Adler", "passenger");

    }


}
