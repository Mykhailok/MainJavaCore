package module6.HW;


import java.util.ArrayList;
import java.util.Arrays;

public class UserUtil {

    public static User[] uniqueUsers(User[] users) {
        ArrayList result = new ArrayList();
        for(int i=0; i < users.length; i++) {
            for (int j = 0; j < users.length; j++) {
                if (users[i] != null && i != j && (users[i].equals(users[j])))
                        users[j] = null;
            }
        }
            for (User i : users) {
                if (i != null){
                    result.add(i);
                }
            }

        return (User[]) result.toArray(new User[result.size()]);
    }

    public User[] usersWithContitionalBalance(User[] users, int balance) {
        return new User[0];
    }

    public static final User[] paySalaryToUsers(User[] users) {
        return null;
    }

    public static final long[] getUsersId(User[] users) {
        return null;
    }

    public User[] deleteEmptyUsers(User[] users) {
        return new User[0];
    }


}
