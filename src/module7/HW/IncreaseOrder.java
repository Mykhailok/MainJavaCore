package module7.HW;

import java.util.Comparator;

public class IncreaseOrder implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        return i1 - i2;
    }
}
