package module2.homework;

public class HW2_1 {
    static int[] arrayInt = {-1435, 134, 3460, -4246, 5346, 436, 2344, 150, 25, 987};
    static double[] arrayDouble = {-1435, 134, 3460, -4246, 5346, 436, 2344, 150, 25, 987};


    static int calculateSumInt(int[] arrayInt) {
        int calculateSumInt = 0;
            for (int sum : arrayInt) {
                calculateSumInt += sum;
            }
        return calculateSumInt;
    }

    static double calculateSumDouble(double[] arrayDouble) {
        int calculateSumDouble = 0;
        for (double sum : arrayDouble) {
            calculateSumDouble += sum;
        }
        return calculateSumDouble;
    }

    static int calculateMinInt (int[] arrayInt){
        int calculateMin = arrayInt[0];
        for (int min : arrayInt){
            if (calculateMin > min+1){
                calculateMin = min;
            }
        }
        return calculateMin;
    }

    static double calculateMinDouble(double[] arrayDouble){
        double calculateMin = arrayDouble[0];
        for (double min : arrayDouble){
            if (calculateMin > min+1){
                calculateMin = min;
            }

        }
        return calculateMin;
    }

    static double calculateMaxDouble(double[] arrayDouble){
        double calculateMax = arrayDouble[0];
        for (double max: arrayDouble) {
            if (calculateMax < max+1){
                calculateMax = max;
            }
        }
        return calculateMax;
    }


    static int calculateMaxInt (int[] arrayInt){
        int calculateMax = arrayInt[0];
        for (int max : arrayInt){
            if (calculateMax < max+1){
                calculateMax = max;
            }
        }
        return calculateMax;
    }

    public static void main(String[] args) {
        int sumInt = calculateSumInt(arrayInt);
        System.out.println("Сумма массива в int = "+ sumInt);
        double sumDouble = calculateSumDouble(arrayDouble);
        System.out.println("Сумма массива в double = "+ sumDouble);
        int calculateMinInt = calculateMinInt(arrayInt);
        System.out.println("Минимальное число в массиве Int = " + calculateMinInt);
        int calculateMaxInt = calculateMaxInt(arrayInt);
        System.out.println("Максимальное число в массиве Int = " + calculateMaxInt);
        double calculateMinDouble = calculateMinDouble(arrayDouble);
        System.out.println("Минимальное число в массиве Double = " + calculateMinDouble);
        double calculateMaxDouble = calculateMaxDouble(arrayDouble);
        System.out.println("Максимальное число в массиве Double = " + calculateMaxDouble);
    }
}

