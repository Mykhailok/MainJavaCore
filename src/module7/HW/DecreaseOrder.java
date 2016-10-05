package module7.HW;

import java.util.Comparator;

public class DecreaseOrder implements Comparator<Order> {

        @Override
        public int compare(Order i1, Order i2) {
            return i2.getPrice() - i1.getPrice();
        }
    }

