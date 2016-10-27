package module10.homework;

public class Task10_2 {
    public static void main(String[] args) throws ExceptionClass {


        try{
            checkString("try1");

        }catch(ExceptionClass e){

            e.myOwnMethod();

        }finally {
            checkString("try");
        }
    }

    private static void checkString(String test) throws ExceptionClass {
        if (test.equals("try")){
            System.out.println("All right!!!");
        }
        else {

            throw new ExceptionClass("call 911");

        }
    }

}
