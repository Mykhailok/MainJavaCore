package module7.practice;

import java.util.Set;
import java.util.TreeSet;

public class WarmUpTask4 {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User("Andrey", 10));
        users.add(new User("Dima", 69));
        users.add(new User("Rita", 27));


        System.out.println(users);




    }
}
