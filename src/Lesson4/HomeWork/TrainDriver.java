package Lesson4.HomeWork;

public class TrainDriver extends RGDWorker {
    private  int countWorkDay;
    @Override
    protected void doSomeWork() {
        System.out.print("Train Driver ");
        super.doSomeWork();

        Train.go(10);
        countWorkDay+=1;
    }

    @Override
    public void getMoney() {
        if(countWorkDay < 1){
            System.out.println("no money");
        }else
            System.out.println("THe employee receives a salary in one day");
    }
}
