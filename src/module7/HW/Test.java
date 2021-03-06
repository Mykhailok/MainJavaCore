package module7.HW;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for(int i = 0 ; i < 1000000; i ++) {
            for(int j = 0 ; j < 1000000; j ++) {
                int a = i * 10 - 1000 + 200 - 21212;

            }
        }

        long finish = System.currentTimeMillis();

        //System.out.println(finish - start);

        List<List<User>> uniqeCity = new ArrayList<>();
        List<User> usersCity = new ArrayList<>();
        List<User> usersCity2 = new ArrayList<>();
        List<String> cities = new ArrayList<>();
        List<List<User>> result = new ArrayList<>();
        List<Order> makeOrderList = new ArrayList<>();
        //List<List<Order>> makeListOfOrderLists = new ArrayList<List<Order>>();


        usersCity.add(new User(10,"FirstName1", "LastName1", "Kyiv", 1001));
        usersCity.add(new User(11,"FirstName2", "LastName2", "Kyiv", 1002));
        usersCity.add(new User(12,"FirstName3", "LastName3", "Odessa", 1003));

        usersCity2.add(new User(13,"FirstName1", "LastName1", "Lviv", 1004));
        usersCity2.add(new User(14,"FirstName2", "LastName2", "Lviv", 1005));
        usersCity2.add(new User(15,"FirstName3", "LastName3", "Odessa", 1006));



        //System.out.println("usersCity:"+usersCity);
        //System.out.println("usersCity2:"+usersCity2);

        uniqeCity.add(usersCity);
        uniqeCity.add(usersCity2);
        //System.out.println(uniqeCity);
        //makeOrderList.add(new Order(1,100,Currency.UAH,"ItemName","Shop", new User(10,"FirstName1", "LastName1", "Kyiv", 1001)));


        for (List<User> city : uniqeCity){
            //System.out.println(city);
            //System.out.println(citySeparate.getCity());
            //Stream------------------------------------------
            /*for (User citySeparate : city){
                if (!cities.contains(citySeparate.getCity())){

                    cities.add(citySeparate.getCity());
                    result.add(new ArrayList<>(Collections.singletonList(citySeparate)));
                }
                //System.out.println(citySeparate.getCity());

            }*/

            city.stream().filter(citySeparate -> !cities.contains(citySeparate.getCity())).forEach(citySeparate -> {

                cities.add(citySeparate.getCity());
                result.add(new ArrayList<>(Collections.singletonList(citySeparate)));
            });
            //StreamFinish----------------------------------------
        }
        System.out.println(cities);
        System.out.println(result);

    }
}
