package module10.homework;

public class Main {
    public static void main(String[] args) throws ExceptionClass {
        Task10_4 item = new Task10_4();
        //item.f();
        try {
            item.f();
        } catch (NullPointerException e) {
            System.out.println("Yeeehaaa, we cought this Exception");
            //exceptionClass.printStackTrace();
        }

    }
}
