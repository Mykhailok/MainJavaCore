package module7.HW;

import java.util.Comparator;

public class IncreaseCity implements Comparator<Order> {


    @Override
    public int compare(Order city1, Order city2) {
        return city1.getUser().getCity().compareTo(city2.getUser().getCity());
    }
}
