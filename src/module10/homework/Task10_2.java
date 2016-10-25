package module10.homework;

public class Task10_2 {
    public static void main(String[] args) throws ExceptionClass {
        //checkString("try2");

        try{
            checkString("try1");
        }catch(ExceptionClass e){
            System.out.println("Bad String");
            throw new ExceptionClass("call 911");
        }
    }

    private static void checkString(String test) throws ExceptionClass {
        if (test.equals("try")){
            System.out.println("All right!!!");
        }
        else {
            //return;
            throw new ExceptionClass("call 911");
        }
    }

}
