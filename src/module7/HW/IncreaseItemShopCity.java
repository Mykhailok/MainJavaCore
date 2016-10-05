package module7.HW;

import java.util.Comparator;

public class IncreaseItemShopCity implements Comparator<Order> {

    @Override
    public int compare(Order i1, Order i2) {
        if (i1.getPrice() - i2.getPrice() != 0){
            return i1.getPrice() - i2.getPrice();
        }
        if (!i1.getShopIdentificator().equals(i2.getShopIdentificator())){
            return i1.getShopIdentificator().compareTo(i2.getShopIdentificator());
        }

        return i2.getUser().getCity().compareTo(i1.getUser().getCity());
    }

}
