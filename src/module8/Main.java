package module8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(100, "Name"));
        users.add(new User(101, "Name1"));
        users.add(new User(102, "Name2"));


        System.out.println(users);

        //AbstractDAO methods = new AbstractDAOImpl();

        UserDAO usrDao = new UserDAO();
            usrDao.saveUsr(new User(103, "Name3"));

        usrDao.getByIdUsr(101);

        System.out.println(users);

    }
}
