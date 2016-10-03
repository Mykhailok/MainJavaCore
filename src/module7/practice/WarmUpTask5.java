package module7.practice;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class WarmUpTask5 {

    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User("Andrey", 10));
        users.add(new User("Dima", 69));
        users.add(new User("Rita", 27));
        System.out.println(users);

        Iterator<User> iterator = users.iterator();


       /* System.out.println("iterator:");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("foreach:");
        for (User user : users) {
            System.out.println(user);
        }*/

        while (iterator.hasNext()){
            if (iterator.next().getAge() > 25) iterator.remove();
            System.out.println(users);
        }

    }
}
