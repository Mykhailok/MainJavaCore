package module10.homework;


public class ExceptionClass extends Exception {

    public ExceptionClass(String message) {
        super(message);
    }

    public void myOwnMethod(){

        System.out.println(getMessage());

    }
}
