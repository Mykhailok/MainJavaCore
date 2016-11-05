package finalproject;

public class CurrentUser {
    public static User curUser;

    public CurrentUser(User curUser) {
        CurrentUser.curUser = curUser;
    }

    public static User getCurUser() {
        return curUser;
    }

    public void setCurUser(User curUser) {
        CurrentUser.curUser = curUser;
    }
}
