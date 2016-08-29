package module2.homework;


public class HW2_4_2 {
    private static String name = "Ann";
    private static double withdraw = 100;
    private static int[] balances ={1200, 250, 2000, 500, 3200};
    private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static double fundBalance(String ownerName, double fund) {
        double balance = -1;
        for (int i  = 0; i < ownerNames.length; i++){
            if (ownerNames[i].equals(ownerName)) {
                balance = balances[i] + fund;
            }
        }
        return balance;
    }


    public static void main(String[] args) {
        if (fundBalance(name, withdraw) >= 0) {
            System.out.println(name + " " + fundBalance(name,withdraw));
        } else System.out.println("NO such name");
    }

}
