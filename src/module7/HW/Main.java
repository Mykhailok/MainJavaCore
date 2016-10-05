package module7.HW;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        long id = 1000;
        int c = 0;
        String[] city = {"Kyiv", "Lviv", "Odessa", "Poltava", "London", "Paris", "Erevan", "Baku", "Kyiv", "Minsk"};
        String firstName = "FirstName";
        String lastName = "LastName";
        int balance = 500;
        Set<User> users = new TreeSet<>();
        for (int i = 0 ; i < 10; i++) {
            users.add(new User(id,firstName,lastName,city[c],balance));
            id++;
            c++;
            balance += 500;
        }
        System.out.println(users);

    }
}
