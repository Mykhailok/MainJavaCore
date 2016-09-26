package module6.HW;

import java.util.Arrays;

public class Main {
    static int[] array = {1, 2, 3, 4};

    public static void main(String[] args) {

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Перевернутый массив: " + Arrays.toString(ArrayUtils.reverse(array)));
        System.out.println("Четные элементы массива: " + Arrays.toString(ArrayUtils.findEvenElements(array)));
    }

}
