import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int b = scanner.nextInt();
        User user = new User(a, b);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
       // user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        //user.addAuto(ford);
        userService.updateUser(user);
    }
}