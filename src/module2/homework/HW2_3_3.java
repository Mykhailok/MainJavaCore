package module2.homework;

public class HW2_3_3 {

    private static String name = "Ann";
    private static double withdraw = 100;
    private static double commission = 0.05;
    private static int[] balances = {1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


    static double withdrawBalance(String ownerName, double withdrawal) {
        double rest = -1;
        double balance;
        for (int i =0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                balance = balances[i];
                rest = balance - withdrawal - withdrawal*commission;

            }

        }

            return rest;

    }

    public static void main(String[] args) {

            if (withdrawBalance(name, withdraw) >= 0) {
                System.out.println(name + " " + withdraw + " " + withdrawBalance(name, withdraw));
            } else System.out.println(name + " NO");

    }

}