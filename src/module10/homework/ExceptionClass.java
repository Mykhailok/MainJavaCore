package module10.homework;


public class ExceptionClass extends Exception {

    public ExceptionClass(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
