package module10.homework;

public class Task10_4 {

    public void f() throws ExceptionClass {
        System.out.println("Calling in method f() -> g()");
        g();

    }

    public void g() throws ExceptionClass {

       throw new ExceptionClass("Exception in method g");

    }


}
