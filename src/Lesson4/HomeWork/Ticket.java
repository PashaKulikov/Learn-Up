package Lesson4.HomeWork;

public class Ticket {
    public int numberOfWagon ;
    public int numberOfPlace;
    public String direction;

    public Ticket(String direction, int numberOfWagon, int numberOfPlace) {
        this.numberOfWagon = numberOfWagon;
        this.numberOfPlace = numberOfPlace;
        this.direction = direction;
    }
}
