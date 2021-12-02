package Lesson4.HomeWork.MyException;

public class WrongTicketNumber extends Exception {
    public WrongTicketNumber(String s) {
        super("Wrong ticket number. " + s );
    }
}
