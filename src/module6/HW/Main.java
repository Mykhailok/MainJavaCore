package module6.HW;

import java.util.Arrays;

public class Main {
    static int[] array = {1, 2, 3, 4};

    static User[] users = new User[5];



    public Main(){
        User user1 = new User(1001, "FirstName", "LastName", 1000, 1000);
        users[0] = user1;
        User user2 = new User(1001, "FirstName", "LastName", 1000, 1000);
        users[1] = user2;
        User user3 = new User(1003, "FirstName3", "LastName3", 3000, 3000);
        users[2] = user3;
        User user4 = new User(1004, "FirstName4", "LastName4", 4000, 4000);
        users[3] = user4;
        User user5 = new User(1005, "FirstName5", "LastName5", 5000, 5000);
        users[4] = user5;
    }



    public static void main(String[] args) {
        new Main();
        //System.out.println("Исходный массив: " + Arrays.toString(array));
        //System.out.println("Перевернутый массив: " + Arrays.toString(ArrayUtils.reverse(array)));
        //System.out.println("Четные элементы массива: " + Arrays.toString(ArrayUtils.findEvenElements(array)));
        //System.out.println(Arrays.toString(UserUtil.uniqueUsers(users)));
        System.out.println(Arrays.toString(UserUtil.usersWithContitionalBalance(users, 3000)));



    }

}
