package module7.HW;

import java.util.ArrayList;
import java.util.LinkedList;

public class Methods {
    ArrayList<Integer> addArrayInt = new ArrayList<Integer>();
    ArrayList<String> addArrayStr = new ArrayList<String>();
    LinkedList<Integer> addLinkedInt = new LinkedList<Integer>();
    LinkedList<String> addLinkedStr = new LinkedList<String>();
    int a = 20,b = 30,e = 40;
    String one = "one", two = "two", three = "three";

    public String addArrayInt(){
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            addArrayInt.add(a*b*e);
        }
        long stopAddArrayInt = System.currentTimeMillis();
        long result = stopAddArrayInt - startAddArray;
        return String.valueOf(result);
    }

    public String addArrayStr(){
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addArrayStr.add(one+two+three);
        }
        long stopAddArray = System.currentTimeMillis();
        long result = stopAddArray - startAddArray;
        return String.valueOf(result);
    }

    public String addLinkedInt(){
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            addLinkedInt.add(a*b*e);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);
    }


}
