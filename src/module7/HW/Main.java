package module7.HW;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        long id = 1000;
        int c = 0;
        int price = 1500;
        String[] city = {"Kyiv", "Lviv", "Odessa", "Poltava", "London", "Paris", "Erevan", "Baku", "Kyiv", "Minsk"};
        String firstName = "FirstName";
        String lastName = "LastName";
        String itemName = "ItemName";
        String shopName = "Shop";

        int balance = 500;
        List<User> users = new ArrayList<>();
        //Set<User> users = new TreeSet<>();
        for (int i = 0 ; i < 10; i++) {
            users.add(new User(id,firstName,lastName,city[c],balance));
            id++;
            c++;
            balance += 500;
        }
        System.out.println(users);

        List<Order> orders = new ArrayList<>();

        for (int i = 0; i < 5; i++){
            orders.add(new Order(id, price, Currency.UAH, itemName, "Shop1", users.get(i)));
            id++;
            price +=500;
        }
        for (int i = 5; i < 10; i++){
            orders.add(new Order(id, price, Currency.USD, itemName+"2", shopName+"2", users.get(i)));
            id++;
            price +=500;
        }
        System.out.println(orders);

        //sort list by Order price in decrease order
        orders.sort(new DecreaseOrder());

        System.out.println(orders);

        //- sort list by Order price in increase order AND User city
        orders.sort(new IncreaseOrder());

        System.out.println(orders);


    }
}
