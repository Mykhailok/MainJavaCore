package module2.homework;

public class HW2_2 {

    static double withdrawBalance(double balance, double withdrawal) {
        double commission = withdrawal*0.05;
            System.out.println(commission);
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {

        double balanceAfter = withdrawBalance(100, 99);

        if (balanceAfter >= 0) {
            System.out.println("OK "+ balanceAfter);
        }
        else{
            System.out.println("NO");
        }
    }

}
