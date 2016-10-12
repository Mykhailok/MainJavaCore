package module7.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateLists {

    public static void main(String[] args) {
        List<Order> makeOrderList = new ArrayList<>();

        List<List<Order>> orderLists = new ArrayList<List<Order>>();
        List<String> cities = new ArrayList<>();


        makeOrderList.add(new Order(1,100,Currency.UAH,"ItemName1","Shop1", new User(10,"FirstName1", "LastName1", "Kyiv", 1001)));
        makeOrderList.add(new Order(2,200,Currency.UAH,"ItemName2","Shop2", new User(20,"FirstName1", "LastName1", "Kyiv", 2001)));
        makeOrderList.add(new Order(3,300,Currency.UAH,"ItemName3","Shop3", new User(30,"FirstName1", "LastName1", "Odessa", 3001)));
        makeOrderList.add(new Order(4,400,Currency.UAH,"ItemName4","Shop4", new User(40,"FirstName4", "LastName4", "Lviv", 4001)));

        for (Order getCity : makeOrderList){
            if (!cities.contains(getCity.getUser().getCity())){
                cities.add(getCity.getUser().getCity());
                orderLists.add(new ArrayList<>());
            }

        }

        //orderLists.add(new ArrayList<>(Arrays.asList(separateCity)));

        System.out.println(cities);
        System.out.println(orderLists);


    }

}
