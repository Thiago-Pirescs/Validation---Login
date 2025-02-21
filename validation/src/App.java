import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String userName = "admin";
        String password = "password";
        String inputUsername;
        String inputPassword;

        while (true) {

            System.out.println("Type your login: ");
            inputUsername = scanner.nextLine();

            System.out.println("Please, type your passowrd: ");
            inputPassword = scanner.nextLine();

            if (inputUsername.equals(userName) && (inputPassword.equals(password))) {

                System.out.println("login successful! ");

             scanner.close();
                break;
            } else {
                System.out.println("login denied, please try again!");
            }

        }
    }
}
