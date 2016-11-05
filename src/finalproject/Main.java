package finalproject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.print("Введите имя пользователя без пробелов(иначе будет взято только первое слово):");
        Scanner scanner = new Scanner(System.in);
        String read = scanner.next();
        controller.registerUser(new User(read));
        scanner.close();
        System.out.println("The current User is: "+CurrentUser.getCurUser());
    }

}
