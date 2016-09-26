package module6.HW;

import java.util.ArrayList;

public final class ArrayUtils {

    public static final int sum(int[] arrayInt) {
        int calculateSumInt = 0;
        for (int sum : arrayInt) {
            calculateSumInt += sum;
        }
        return calculateSumInt;
    }

    public static final int min (int[] arrayInt) {
        int calculateMin = arrayInt[0];
        for (int min : arrayInt) {
            if (calculateMin > min) {
                calculateMin = min;
            }
        }
        return calculateMin;
    }

    public static final int max (int[] arrayInt){
        int calculateMax = arrayInt[0];
        for (int max : arrayInt){
            if (calculateMax < max){
                calculateMax = max;
            }
        }
        return calculateMax;
    }

    public static final int maxPositive(int[] arrayMaxPositiveInt){
        max(arrayMaxPositiveInt);

        return max(arrayMaxPositiveInt);
    }

    public static final long multiplication  (long[] arrayLong){
        long multi = 1;
        for (long mult : arrayLong){
            multi *= mult;
        }
        return multi;
    }

    public static final int modulus(int[] arrayInt) {
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

    public static final int secondLargest(int[] arrayInt){
        int secondLarger = arrayInt[0];
        int max = max(arrayInt);

        for (int i=0; i < arrayInt.length; i++){
            if ((arrayInt[i] > secondLarger)&&(arrayInt[i] < max)){
                secondLarger = arrayInt[i];
            }
        }
        return secondLarger;
    }

    public static final int[] reverse(int[] array) {

        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-(1+i)];
            array[array.length-(1+i)] = temp;
        }
        return array;
    }

    public static final int[] findEvenElements(int[] array) {

        ArrayList result = new ArrayList();

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if ((temp % 2 == 0) && (temp != 0)) {
                 result.add(temp);
            }
        }
        int[] stringResult = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            stringResult[i] = (int) result.get(i);
        }
        return stringResult;
    }
}
