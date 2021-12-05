package Tema_Lab15_ErrorHandling;


import java.util.HashMap;
import java.util.Scanner;

public class Login {

    ReadFromKeyboard read = new ReadFromKeyboard();

    public boolean isLoggedIn() {

        Scanner scan = new Scanner(System.in);

        HashMap<String, String> users = new HashMap<String, String>();

        users.put("Bella", "password11");
        users.put("Zoltan", "password22");
        users.put("Orsolya", "password33");
        users.put("Renata", "password44");
        users.put("Eniko", "password55");
        users.put("Emese", "password66");

        String givenUsername = read.getUsername();
        String givenPassword = read.getPassword();

        if (users.containsKey(givenUsername) && users.get(givenUsername).equals(givenPassword)) {
            System.out.println(Messages.SUCCESS_LOGIN);

            return true;
        } else {
            System.out.println(Messages.FAILED_LOGIN);
            return false;
        }
    }

    public boolean loginSuccessful() {
        System.out.println(Messages.HELLO);
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        } while (!repeat && count < 3);

        return repeat;
    }
}
