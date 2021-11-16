package Lesson4.HomeWork;

public class  RGD {
    public static void main(String[] args) {
    Train train1 = new Train(30,"Penza","passenger");
    train1.go(50);
    train1.setStop(true);
    train1.viewedStatus();

    }
}
