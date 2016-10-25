package module10.homework;

import module8.User;

public class Task10_3 {
    public static void main(String[] args) {
        User user = null;
        try{
            user.getName();
        }catch (NullPointerException e){
            System.out.println("Get Null Pointer Exception!!");
        }

    }
}
