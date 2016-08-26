package module2.homework;

public class HW2_2 {
    private static double commission;

    static double withdrawBalance(double balance, double withdrawal) {
        commission = withdrawal*0.05;
        return balance - withdrawal - commission;

    }

    public static void main(String[] args) {

        double balanceAfter = withdrawBalance(100, 50);

        if (balanceAfter >= 0) {
            System.out.println("OK "+ commission + " " + balanceAfter);
        }
        else{
            System.out.println(" NO");
        }
    }

}
