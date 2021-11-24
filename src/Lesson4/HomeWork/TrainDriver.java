package Lesson4.HomeWork;

public class TrainDriver extends RGDWorker {
    @Override
    protected void doSomeWork() {
        System.out.print("Train Driver ");
        super.doSomeWork();

        Train.go(10);


    }
}
