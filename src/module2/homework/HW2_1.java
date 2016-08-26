package module2.homework;

public class HW2_1 {
    static int[] arrayInt = {-16, 134, 3460, -4246, 5346, 436, 2344, 150, 25, 0};
    static double[] arrayDouble = {-1435, 134, 3461, -4246, 5346, 436, 2344, 150, 25, 987};
    static int[] arrayMaxPositiveInt = {-8, -5, 0, 9};
    static double[] arrayMaxPositiveDouble = {-8, -5, -10, -9};
    static long[] arrayLong = {-1435, 134, 3460, -4246, 5346, 436, 2344, 150, 25, 987};

    static int calculateSumInt(int[] arrayInt) {
        int calculateSumInt = 0;
            for (int sum : arrayInt) {
                calculateSumInt += sum;
            }
        return calculateSumInt;
    }

    static double calculateSumDouble(double[] arrayDouble) {
        double calculateSumDouble = 0;
        for (double sum : arrayDouble) {
            calculateSumDouble += sum;
        }
        return calculateSumDouble;
    }

    static int calculateMinInt (int[] arrayInt){
        int calculateMin = arrayInt[0];
        for (int min : arrayInt){
            if (calculateMin > min){
                calculateMin = min;
            }
        }
        return calculateMin;
    }


    static int calculateMaxInt (int[] arrayInt){
        int calculateMax = arrayInt[0];
        for (int max : arrayInt){
            if (calculateMax < max){
                calculateMax = max;
            }
        }
        return calculateMax;
    }


    static double calculateMinDouble(double[] arrayDouble){
        double calculateMin = arrayDouble[0];
        for (double min : arrayDouble){
            if (calculateMin > min){
                calculateMin = min;
            }

        }
        return calculateMin;
    }

    static double calculateMaxDouble(double[] arrayDouble){
        double calculateMax = arrayDouble[0];
        for (double max: arrayDouble) {
            if (calculateMax < max){
                calculateMax = max;
            }
        }
        return calculateMax;
    }

    static int calculateMaxPositiveInt(int[] arrayMaxPositiveInt){
        calculateMaxInt(arrayMaxPositiveInt);

        return calculateMaxInt(arrayMaxPositiveInt);
    }

    static double calculateMaxPositiveDouble(double[] arrayMaxPositiveDouble){
        calculateMaxDouble(arrayMaxPositiveDouble);

        return calculateMaxDouble(arrayMaxPositiveDouble);
    }


    static long multiplicationLong  (long[] arrayLong){
        long multi = 1;
        for (long mult : arrayLong){
            multi *= mult;
        }
        return multi;
    }


    static double multiplicationDouble  (double[] arrayDouble){
        double multD = 1;
        for (double mult : arrayDouble){
            multD *= mult;
        }
        return multD;
    }

    static int modulus(int[] arrayInt) {
        int first = arrayInt[0];
        int last = arrayInt[arrayInt.length - 1];
        int mod = 0;
        if (last != 0) {
            mod = first % last;
            System.out.println("Деление по модулю первого и последнего элемента массива arrayInt = " + mod);
            }
        else System.out.println("Деление на 0 невозможно");
        return mod;
    }


    static double modulusD(double[] arrayDouble){
        double first = arrayDouble[0];
        double last = arrayDouble[arrayDouble.length-1];
        double mod = first % last;
        return mod;
    }

    static int secondLargest(int[] arrayInt){
        int secondLarger = 0;
        int max = calculateMaxInt(arrayInt);

        for (int i=0; i < arrayInt.length; i++){
            if ((arrayInt[i] > secondLarger)&&(arrayInt[i] < max)){
                secondLarger = arrayInt[i];
                }
            }
        return secondLarger;
    }


    static double secondLargestD(double[] arrayDouble){
        double secondLargestD = 0;
        double maxD = calculateMaxDouble(arrayDouble);
        for (double i : arrayDouble){
            if ((i > secondLargestD) && (i < maxD)){
                secondLargestD = i;
            }
        }
        return secondLargestD;
    }


    public static void main(String[] args) {
        int sumInt = calculateSumInt(arrayInt);
        System.out.println("Сумма массива в arrayInt = "+ sumInt);


        double sumDouble = calculateSumDouble(arrayDouble);
        System.out.println("Сумма массива в arrayDouble = "+ sumDouble);


        int calculateMinInt = calculateMinInt(arrayInt);
        System.out.println("Минимальное число в массиве arrayInt = " + calculateMinInt);


        int calculateMaxInt = calculateMaxInt(arrayInt);
        System.out.println("Максимальное число в массиве arrayInt = " + calculateMaxInt);


        double calculateMinDouble = calculateMinDouble(arrayDouble);
        System.out.println("Минимальное число в массиве arrayDouble = " + calculateMinDouble);


        double calculateMaxDouble = calculateMaxDouble(arrayMaxPositiveDouble);
        System.out.println("Максимальное число в массиве arrayMaxPositiveDouble = " + calculateMaxDouble);


        int calculateMaxPositiveInt = calculateMaxPositiveInt(arrayMaxPositiveInt);
            if (calculateMaxInt(arrayMaxPositiveInt) < 0){
                System.out.println("Максимального положительного числа в массиве arrayMaxPositiveInt нет");
        }
            else if (calculateMaxInt(arrayMaxPositiveInt) == 0) {
                System.out.println("Максимально положительное число в массиве arrayMaxPositiveInt равно 0");
        }
            else
                System.out.println("Максимальное положительное число в массиве arrayMaxPositiveInt = " + calculateMaxPositiveInt);

        double calculateMaxPositiveDouble = calculateMaxPositiveDouble(arrayMaxPositiveDouble);
        if (calculateMaxPositiveDouble(arrayMaxPositiveDouble) < 0){
            System.out.println("Максимального положительного числа в массиве arrayMaxPositiveDouble нет");
        }
        else if (calculateMaxPositiveDouble(arrayMaxPositiveDouble) == 0) {
            System.out.println("Максимально положительное число в массиве arrayMaxPositiveDouble равно 0");
        }
        else
            System.out.println("Максимальное положительное число в массиве arrayMaxPositiveDouble = " + calculateMaxPositiveDouble);

        System.out.println("Умножение всех чисел массива arrayLong = " + multiplicationLong(arrayLong));
        System.out.println("Умножение всех чисел массива arrayDouble = " + multiplicationDouble(arrayDouble));
        //System.out.println("Деление по модулю первого и последнего элемента массива arrayInt = " + modulus(arrayInt));
        modulus(arrayInt);
        System.out.println("Деление по модулю первого и последнего элемента массива arrayDouble = " + modulusD(arrayDouble));
        System.out.println("Второе максимальное число в массиве arrayInt = " + secondLargest(arrayInt));
        System.out.println("Второе максимальное число в массиве arrayDouble = " + secondLargestD(arrayDouble));
    }



}


