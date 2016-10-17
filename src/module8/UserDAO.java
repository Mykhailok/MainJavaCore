package module8;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDAO extends AbstractDAOImpl {



    public UserDAO(long id, String name) {
        super(id, name);
    }

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

    public UserDAO getList(Collection t) {

        db.addAll(t);

        return (UserDAO) db;

    }

}
