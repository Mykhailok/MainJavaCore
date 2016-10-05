package module7.HW;

import java.util.Comparator;

public class IncreaseOrder implements Comparator<Order> {

    @Override
    public int compare(Order i1, Order i2) {
        return i1.getPrice() - i2.getPrice();
    }
}
