package module10.homework;

public class Task10_1 {
    public static void main(String[] args) {
        try{
            int a = 0;
            int b = 20/a;
        }catch (Throwable t){
            System.out.println("Arithmetic operation: 'a' can't be zero");
        }
        finally {
            System.out.println("I was there");
        }

    }
}
