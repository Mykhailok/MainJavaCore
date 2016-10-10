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
        Set<Order> duplicateOrder = new HashSet<>();
        Set<Order> UAH = new HashSet<>();
        Set<Order> USD = new HashSet<>();
        List<Order> uniqueCity = new ArrayList<>();
        List<List<Order>> result = new ArrayList<>();

        for (int i = 0 ; i < 9; i++) {
            users.add(new User(id,firstName,lastName,city[c],balance));
            id++;
            c++;
            balance += 500;
        }
        users.add(new User(007,"Petya","Petrov",city[c],balance));
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

    //----------------------------------Homework 7.3 with users----------------------------------
        Set<Order> treeOrders = new TreeSet<>();



        treeOrders.add(new Order(999, 5000, Currency.USD, "Special1", "SuperShop1", users.get(1)));
        treeOrders.add(new Order(998, 5001, Currency.UAH, "Special2", "SuperShop2", users.get(2)));
        treeOrders.add(new Order(997, 5002, Currency.UAH, "Special3", "SuperShop3", users.get(3)));
        treeOrders.add(new Order(996, 5003, Currency.UAH, "Special4", "SuperShop4", users.get(4)));
        treeOrders.add(new Order(995, 5100, Currency.UAH, "Special5", "SuperShop5", users.get(5)));
        treeOrders.add(new Order(994, 5005, Currency.USD, "Special6", "SuperShop6", users.get(6)));
        treeOrders.add(new Order(993, 5006, Currency.USD, "Special7", "SuperShop7", users.get(7)));
        treeOrders.add(new Order(992, 5007, Currency.USD, "Special8", "SuperShop8", users.get(8)));
        treeOrders.add(new Order(991, 5008, Currency.USD, "Special9", "SuperShop9", users.get(9)));
        treeOrders.add(new Order(991, 5008, Currency.USD, "Special9", "SuperShop9", users.get(9)));
        System.out.println("TreeSet:");
        System.out.println(treeOrders);

        //- check if set contain Order where User’s lastName is - “Petrov”
        for (Order checkLastName : treeOrders){
            if (checkLastName.getUser().getLastName().equals("Petrov")){
                System.out.println("There is Petrov!!! at user #" + checkLastName.getUser().getId());
            }

        }

        //- print Order with largest price using only one set method - get

        TreeSet<Order> largestPrice = new TreeSet<>();
        for (Order largePrice : treeOrders){
            largestPrice.add(largePrice);
        }

        System.out.println("Order with largest price: " + largestPrice.last());

        //- delete orders where currency is USD using Iterator
        Iterator<Order> currencyUSD = orders.iterator();
        while (currencyUSD.hasNext()){
            if (currencyUSD.next().getCurrency() == Currency.USD){
                currencyUSD.remove();
            }
        }
        System.out.println(orders);

        /*Generate Integer and String ArrayList and LinkedList with 1000 and 10000 elements.
            Measure time of execution of the following methods and print it to console:
            - add
            - set
            - get
            - remove*/
        Methods methods = new Methods();
        System.out.println("time of execution of the following methods add int are:" + methods.addArrayInt());
        System.out.println("time of execution of the following methods add string are:" + methods.addArrayStr());
        System.out.println("time of execution of the following methods add int are:" + methods.addLinkedInt());
        System.out.println("time of execution of the following methods add string are:" + methods.addLinkedInt());


    }

}
