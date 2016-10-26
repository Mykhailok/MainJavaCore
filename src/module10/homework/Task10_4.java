package module10.homework;

public class Task10_4 {

    public void f() {
        System.out.println("Calling in method f() -> g()");

        try {
            g();
        } catch (ExceptionClass exceptionClass) {
            throw new NullPointerException();
            //exceptionClass.printStackTrace();
        }

    }

    public void g() throws ExceptionClass {

       throw new ExceptionClass("Exception in method g");

    }


}
