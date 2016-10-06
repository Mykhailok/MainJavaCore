package module7.HW;

import java.util.Comparator;

public class IncreaseOrderAndCity implements Comparator<Order> {

    @Override
    public int compare(Order i1, Order i2) {
        if (i1.getPrice() - i2.getPrice() != 0){
            return i1.getPrice() - i2.getPrice();
        }
        return i1.getUser().getCity().compareTo(i2.getUser().getCity());
    }

}
