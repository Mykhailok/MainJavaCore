package finalproject;

public class Controller {

   public void registerUser(User user) {
        CurrentUser currentUser = new CurrentUser(user);
        currentUser.setCurUser(user);
        System.out.println(user+" is registered....");
   }
}
