package Lesson4.HomeWork;

public class RGD {
    public static void main(String[] args) {

        RailwayStation station = new RailwayStation("PenzaStation");
        station.setTrain();
        station.trainsList[1].setStop(true);

        Ticket ticket = new Ticket("Sochi", 6, 9);

        Passenger passenger1 = new Passenger("Pasha", ticket);
        Passenger passenger2 = new Passenger("Tanya", null);
        Passenger passenger3 = new Passenger("Sanya", null);

        Conductor conductor = new Conductor();

        Passenger[] passengers = {passenger1, passenger2, passenger3};
        for (Passenger p : passengers) {
            conductor.doSomeWork(p);
        }


        TrainDriver trainDriver = new TrainDriver();
        trainDriver.doSomeWork();


    }

}
