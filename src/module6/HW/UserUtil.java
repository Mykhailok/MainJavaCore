package module6.HW;

public class UserUtil {

    public static User[] uniqueUsers(User[] users) {
        User[] result = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i+1].equals(users[i])){
                result[i] = users[i];
            }
        }

        return result;
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
