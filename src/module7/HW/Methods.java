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

    public String addLinkedStr(){
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addLinkedStr.add(one+two+three);

        }
        long stopAddArray = System.currentTimeMillis();
        long result = stopAddArray - startAddArray;
        return String.valueOf(result);
    }


    public String setAddArrayInt() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            addArrayInt.set(1,a);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String setAddArrayStr() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            addArrayStr.set(1,one);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String setAddLinkedInt() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addLinkedInt.set(1,b);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String setAddLinkedStr() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addLinkedStr.set(1,two);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String getAddLinkedStr() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addLinkedStr.get(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String getAddLinkedInt() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            addLinkedInt.get(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String getAddArrayInt() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            addArrayInt.get(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String getAddArrayStr() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addArrayStr.get(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String removeAddLinkedInt() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 500; i++){
            addLinkedInt.remove(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String removeAddLinkedStr() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 500; i++){
            addLinkedStr.remove(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String removeAddArrayInt() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 500; i++){
            addArrayInt.remove(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

    public String removeAddArrayStr() {
        long startAddArray = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++){
            addArrayStr.remove(i);
        }
        long stopAddLinkedInt = System.currentTimeMillis();
        long result = stopAddLinkedInt - startAddArray;
        return String.valueOf(result);

    }

}