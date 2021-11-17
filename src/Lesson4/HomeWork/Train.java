package Lesson4.HomeWork;

public class Train {
    private int speed;
    private boolean isComing;
    private boolean isStanding;
    private int numbersOfWagons;
    private String direction;
    private String typeOfTransportation;


    public Train(int numbersOfWagons, String direction, String typeOfTransportation) {

        this.numbersOfWagons = numbersOfWagons;
        this.direction = direction;
        this.typeOfTransportation = typeOfTransportation;
    }

    public void go(int currentSpeed) {
        isComing = true;
        speed = currentSpeed;
        System.out.println("The train started to move" + " his speed is " + currentSpeed);
    }

    public void setStop(boolean stop) {
        isStanding = stop;
        System.out.println("The train stopped");
    }

    public void viewedStatus() {
        System.out.println((isStanding == false) ? "The train is coming " : "The train is stopped");
    }


}
