package module8;


import java.util.ArrayList;
import java.util.List;

public class UserDAO extends AbstractDAOImpl {


    private static long id;
    private static String name;



    public static UserDAO save (UserDAO user) {
        save(user);
        return user;
    }

    public static void main(String[] args) {


        save(new UserDAO());

    }


}
