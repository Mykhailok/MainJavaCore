package module7.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class WarmUpTask1 {

    public static void main(String[] args) {
        @SuppressWarnings("unchecked") // убирает предупреждения с той стрингой, которая в скобках
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(20);
        System.out.println(list);

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i1 - i2;//decrease i2-i1
            }
        };
        list.sort(new IncreaseOrder());
        System.out.println(list);
    }



}
