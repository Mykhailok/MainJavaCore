package module7.practice;

import java.util.ArrayList;
import java.util.Comparator;

public class WarmUpTask2 {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Yalta");
        stringList.add("Kiev");
        stringList.add("Praga");
        stringList.add("London");
        stringList.add("Odessa");

        System.out.println(stringList);

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        stringList.sort(c);

        System.out.println(stringList);


    }



}
