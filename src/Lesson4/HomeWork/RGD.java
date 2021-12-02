package Lesson4.HomeWork;

import Lesson4.HomeWork.MyException.NoDirectionOfTrainException;
import Lesson4.HomeWork.MyException.WrongTicketNumber;

import java.sql.SQLOutput;

public class RGD {
    public static void main(String[] args) {

        /*RailwayStation station = new RailwayStation("PenzaStation");
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

        trainDriver.getMoney();
        conductor.getMoney();*/

        /**Lesson 7. Exception1.
        *
        */
        Train train1 = new Train(null, 20, "passengers");

        try {
            checkTrain(train1);
        } catch (NoDirectionOfTrainException e) {
            System.out.println(e);
        }

        /**Lesson 7. Exception2.
         *
         */
        Ticket ticket = new Ticket("Goa - Arambol", 20, 666);
        Passenger passenger = new Passenger("Pasha", ticket);

        try{
            checkTicket(passenger);
        }catch (WrongTicketNumber er){
            System.out.println(er);
        }finally {
            System.out.println("The train starts moving");
        }
    }


    /**
     * The method checks for the presence of a direction
     */
    public static void checkTrain(Train train) {
        if (train.getDirection() == null) {
            throw new NoDirectionOfTrainException();
        }
    }

    /**
     * The method checks ticket
     */

    public static void checkTicket(Passenger passenger) throws WrongTicketNumber {
        if (passenger.ticket.numberOfPlace > 80 ) {
            throw new WrongTicketNumber("no ticket " + passenger.ticket.numberOfPlace );
        }
    }
}
