package LoginApp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<user> users = new ArrayList<>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter username: ");
            String username = input.nextLine();

            System.out.println("Enter password: ");
            String password = input.nextLine();

            validate(username, password);

             users.add(new user(username, password));
             System.out.println("User registered Successfully " + username);

        } catch (Exception e){
            System.out.println("Error :"+ e.getMessage());
        }
    }
    static void validate(String username, String password)throws Exception{
        if (username.isEmpty()) {
            throw new Exception("Username Cannot Be Empty");
        }
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters");
        }
    }
}
