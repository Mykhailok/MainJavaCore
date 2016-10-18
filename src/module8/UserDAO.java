package module8;


import java.util.Collection;

public class UserDAO extends AbstractDAOImpl<User> {



    public UserDAO save (UserDAO user) {
        save(user);
        return user;
    }

    public UserDAO delete (UserDAO user) {
        delete(user);
        return user;
    }


    public UserDAO deleteAll (UserDAO user) {
        deleteAll(user);
        return user;
    }

    public UserDAO saveAll (UserDAO user) {
        saveAll(user);
        return user;
    }

    public User getList(Collection t) {

        db.addAll(t);

        return (User) db;

    }

}
