package module2.homework;

public class HW2_3 {
    private static double commission = 0.05;
    private static String nameOwn = "Ann";
    private static double withdrawal = 100;
    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};




    static String[] getOwnerNames(int[] balances, String[] ownerNames) {

        for (int balance : balances) {
            double sum = balance - withdrawal*commission;



            System.out.println(sum);
        }



        for(String name : ownerNames) {
            if (name == nameOwn) {

                System.out.println(name);
            }
        }



        return ownerNames;



    }
    public static void main(String[] args) {
            getOwnerNames(balances,ownerNames);

    }

}
