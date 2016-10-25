package module10.homework;

public class Task10_1 {
    public static void main(String[] args) throws Exception {
        try{
            //int a = 0;
            //int b = 20/a;
            throw  new Exception("New Exception");
        }catch (Throwable t){

            //System.out.println("Arithmetic operation: 'a' can't be zero");
            t.printStackTrace();
        }
        finally {
            System.out.println("I was there");
        }

    }
}
