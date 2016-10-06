package module7.HW;

import java.util.Comparator;

public class IncreaseItemShopCity implements Comparator<Order> {

    @Override
    public int compare(Order i1, Order i2) {
        if (!i1.getItemName().equals(i2.getItemName())){
            return i1.getItemName().compareTo(i2.getItemName());
        }
        if (!i1.getShopIdentificator().equals(i2.getShopIdentificator())){
            return i1.getShopIdentificator().compareTo(i2.getShopIdentificator());
        }

        return i1.getUser().getCity().compareTo(i2.getUser().getCity());
    }

}
