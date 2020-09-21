import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String encrypted="";
        for(int i = 0;i < message.length(); i++) {
            int c = message.charAt(i);
            if(Character.isUpperCase(c)) {
                c += (3%26);
            }
            if(c>'Z'){
                c -= 26;
            }
            else if(Character.isLowerCase(c)){
                c += (3%26);
            }
            if(c>'z'){
                c -= 26;
            }
            encrypted += (char)c;
        }
        return encrypted;
    }

    public static String decryptCaesar(String message) {
        String s = "";
        for(int i = 0; x < message.length(); i++) {
            char ch = message.charAt(i);
            if (ch >= 65 && ch<= 90 || ch >= 97 && ch <=127) {
                s += (char)(message.charAt(i) - (26-3));
            }
            else {
                s += message.charAt(i);
            }
        }
        return s;
    }

    public static String encryptCaesarKey(String message, int key) {
        return message;
    }

    public static String decryptCaesarKey(String message, int key) {
        return message;
        // REPLACE THIS WITH YOUR CODE
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
