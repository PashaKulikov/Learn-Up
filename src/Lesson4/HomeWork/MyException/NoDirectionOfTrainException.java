package Lesson4.HomeWork.MyException;

public class NoDirectionOfTrainException extends RuntimeException {
    public NoDirectionOfTrainException(){
    super("The train has no direction ");
}
}