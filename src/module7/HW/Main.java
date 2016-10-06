package module7.HW;

import java.util.*;
import java.util.stream.Collectors;

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
        Set<Order> duplicateOrder = new HashSet<>();
        Set<Order> UAH = new HashSet<>();
        Set<Order> USD = new HashSet<>();
        List<Order> uniqueCity = new ArrayList<>();
        List<List<Order>> result = new ArrayList<>();

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
        for (int i = 5; i < 9; i++){
            orders.add(new Order(id, price, Currency.USD, itemName+"2", shopName+"2", users.get(i)));
            id++;
            price +=500;
        }
        orders.add(new Order(999, 5000, Currency.USD, "Special", "SuperShop", users.get(9)));
        System.out.println(orders);

        //sort list by Order price in decrease order
        orders.sort(new DecreaseOrder());

        System.out.println(orders);

        //- sort list by Order price in increase order AND User city
        orders.sort(new IncreaseOrder());

        System.out.println(orders);
        //- sort list by Order itemName AND ShopIdentificator AND User city
        orders.sort(new IncreaseOrderAndCity());

        System.out.println(orders);

        orders.sort(new IncreaseItemShopCity());

        System.out.println(orders);

        //- delete duplicates from the list
//        for (Order searchDuplicate : orders) {
//            duplicateOrder.add(searchDuplicate);
//        }
        duplicateOrder.addAll(orders);
        System.out.println(duplicateOrder);

        //- delete items where price less than 1500
        Iterator<Order> iterator = orders.iterator();

        while (iterator.hasNext()){
            if (iterator.next().getPrice() < 1500) {
                iterator.remove();
            }
        }

        System.out.println(orders);

        //- separate list for two list - orders in USD and UAH
        for (Order uah : orders){
            if (uah.getCurrency() == Currency.UAH) {
                UAH.add(uah);
            }
        }

        for (Order usd : orders){
            if (usd.getCurrency() == Currency.USD) {
                USD.add(usd);
            }
        }
        //UAH.addAll(orders.stream().filter(separateCurrencyUAH -> separateCurrencyUAH.getCurrency() == Currency.UAH).collect(Collectors.toList()));

        //USD.addAll(orders.stream().filter(separateCurrencyUSD -> separateCurrencyUSD.getCurrency() == Currency.USD).collect(Collectors.toList()));
        System.out.println("UAH:");
        System.out.println(UAH);
        System.out.println("USD:");
        System.out.println(USD);

        //- separate list for as many lists as many unique cities are in User
        orders.sort(new IncreaseCity());

        for (Order listOrders : orders){
            uniqueCity.add(listOrders);
        }
        result.add(uniqueCity);
        System.out.println("Result:");
        System.out.println(result);




    }
}
