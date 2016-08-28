package module2.homework;

public class HW2_3_2 {

        private static double commission = 0.05;
        private static int[] balances = {1200, 250, 2000, 500, 3200};
        private static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};


        static double withdrawBalance(String ownerName, double withdrawal) {
            double rest = 0;

            for (int i = 0; i < ownerNames.length; i++) {
                double balance = balances[i];
                rest = balance - withdrawal - withdrawal * commission;
                if (rest > 0) {
                    if (ownerName.equals(ownerNames[i])) {
                        System.out.println(ownerNames[i] + " " + withdrawal + " " + rest);
                    }
                } else System.out.println(ownerNames[i] + " NO");
            }
            return rest;
        }

        public static void main(String[] args) {


            withdrawBalance("Ann", 100);

        }


}