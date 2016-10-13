package module7.HW;

import java.util.*;

public class SeparateLists {

    public static void main(String[] args) {
        List<Order> makeOrderList = new ArrayList<>();
        List<List<Order>> orderLists = new ArrayList<List<Order>>();

        Set<String> cities = new HashSet<>();

        makeOrderList.add(new Order(1,100,Currency.UAH,"ItemName1","Shop1", new User(10,"FirstName1", "LastName1", "Kyiv", 1001)));
        makeOrderList.add(new Order(2,200,Currency.UAH,"ItemName2","Shop2", new User(20,"FirstName1", "LastName1", "Kyiv", 2001)));
        makeOrderList.add(new Order(3,300,Currency.UAH,"ItemName3","Shop3", new User(30,"FirstName1", "LastName1", "Odessa", 3001)));
        makeOrderList.add(new Order(4,400,Currency.UAH,"ItemName4","Shop4", new User(40,"FirstName4", "LastName4", "Lviv", 4001)));

        for (Order getCity : makeOrderList){
            if (getCity.getUser().getCity() != null){
                cities.add(getCity.getUser().getCity());
            }
        }
            for (String s : cities){
                List<Order> temp = new ArrayList<>();
                for (int i = 0; i < makeOrderList.size(); i++){
                   if (makeOrderList.get(i).getUser().getCity() == s){
                       temp.add(makeOrderList.get(i));
                   }
                }
                orderLists.add(temp);
            }

        System.out.println(cities);
        System.out.println(orderLists);


    }

}
