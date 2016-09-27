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

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        ArrayList result = new ArrayList();
        for (User i : users){
            if (i.getBalance() == balance){
                result.add(i);
            }
        }
        return (User[]) result.toArray(new User[result.size()]);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        ArrayList result = new ArrayList();
        int balance, salary, res;
        for (User i : users){
            balance = i.getBalance();
            //System.out.println("balance = " + balance);
            salary = i.getSalary();
            //System.out.println("salary = " + salary);
            res = balance + salary;
            //System.out.println("res = " + res);
            i.setBalance(res);
            result.add(i);
        }
        return (User[]) result.toArray(new User[result.size()]);
    }

    public static final long[] getUsersId(User[] users) {
        ArrayList result = new ArrayList();
        for (User i : users){
            result.add(i.getId());
            //System.out.println(result);
        }
        long[] stringResult = new long[result.size()];
        for (int i = 0; i < result.size(); i++){
            stringResult[i] = (long) result.get(i);
        }
        return stringResult;
    }

    public static final User[] deleteEmptyUsers(User[] users) {
        ArrayList result = new ArrayList();
        for (User i : users){
            if (!i.equals(null) && i.getId() != 0 && i.getFirstName() != null
                    && i.getLastName() != null && i.getSalary() != 0 && i.getBalance() != 0){
                result.add(i);
            }
        }
        return (User[]) result.toArray(new User[result.size()]);
    }


}
