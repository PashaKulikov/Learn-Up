package Lesson4.HomeWork;

public class Train {
    public static int speed;
    public static boolean isComing;
    private boolean isStanding;
    private int numbersOfWagons;
    private String direction;
    private String typeOfTransportation;


    public Train( String direction,int numbersOfWagons, String typeOfTransportation) {

        this.direction = direction;
        this.numbersOfWagons = numbersOfWagons;
        this.typeOfTransportation = typeOfTransportation;
    }

    public static void go(int currentSpeed) {
        isComing = true;
        speed = currentSpeed;
        System.out.println("The train started to move" + " his speed is " + currentSpeed);
    }

    public void setStop(boolean stop) {
        isStanding = stop;
        System.out.println("The train " + direction+   " stopped.");
    }

    public void viewedStatus() {
        System.out.println((isStanding == false) ? "The train is coming " : "The train is stopped");
    }


}
