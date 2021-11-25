package Lesson4.HomeWork;

import java.sql.SQLOutput;

public class Conductor extends RGDWorker {

    private int countWorkDay;

    /**
     * method overloading
     * Conductor check ticket
     */
    protected void doSomeWork(Passenger passenger) {
        System.out.print("conductor ");
        super.doSomeWork();
        if(passenger.ticket == null){
            System.out.println(passenger.name + " you have to buy a ticket");
        } else {
            System.out.printf( "%s your wagon is %d your place is %d.", passenger.name, passenger.ticket.numberOfWagon, passenger.ticket.numberOfPlace);
            System.out.println();
            countWorkDay+=1;
        }


    }
    @Override
    public void getMoney() {
        if(countWorkDay < 1){
            System.out.println("no money");
        }else
            System.out.println("THe employee receives a salary in one day");
    }
}
