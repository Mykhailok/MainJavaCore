package module10.homework;

public class Task10_5 {
    public static void main(String[] args) {
        int[] i = {1,2,3};

        try{
            if (i[0] == 1){
                throw new OneException("FirtException");
            }
            else if (i[1] == 2){
                throw new TwoException("SeconException");
            }
            else
            throw new ThreeEcxeption("Third Exception");
        }catch (OneException | TwoException | ThreeEcxeption e){
            System.out.println("I was there");
            e.fillInStackTrace();
        }
    }
}
