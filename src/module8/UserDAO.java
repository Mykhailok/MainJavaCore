package module8;


import java.util.Collection;

public class UserDAO extends AbstractDAOImpl<User> {



    public User saveUsr (User user) {
        save(user);
        return user;
    }

    public User deleteUsr (User user) {
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

    public  User getById(long id){
            getById(id);
        return (User) db ;

    }

    public void deleteById(long id){
        deleteById(id);
    }

}
