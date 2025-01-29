import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGen {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose the length(number) of your password");
        int option = userInput.nextInt();
        if(option < 1 || option > 100){
            System.out.println("Choose between 1 and 100");

        }

        String password = generatePassword(option);
        System.out.println("Generated Password: " + password);
    }


        public static String generatePassword(int length){
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{};':\",./<>?";
            SecureRandom random = new SecureRandom();
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(chars.length());
                password.append(chars.charAt(randomIndex));
            }
            return password.toString();
        }
    }
