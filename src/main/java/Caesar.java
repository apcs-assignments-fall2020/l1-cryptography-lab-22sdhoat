import java.util.Scanner;

public class Caesar {
    public static String encryptCaesar(String message) {
        String s = "";
        for(int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if ((ch >= 65 && ch<= 90)||(ch >= 97 && ch <=122))  { 
                if ((ch >= 88 && ch <= 90)||(ch >= 120 && ch <= 122)) {
                    s += (char)(ch - 23);
                }
                else {
                    s += (char)(ch + 3);
                }
            }
            else {
                s += ch;
            }
        }
        return s;
    }

    public static String decryptCaesar(String message) {
        String s = "";
        for(int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if ((ch >= 65 && ch<= 90)||(ch >= 97 && ch <=122))  { 
                if ((ch >= 65 && ch <= 67)||(ch >= 97 && ch <= 99)) {
                    s += (char)(ch + 23);
                }
                else {
                    s += (char)(ch - 3);
                }
            }
            else {
                s += ch;
            }
        }
        return s;
    }

    public static String encryptCaesarKey(String message, int key) {
        String s = "";
        key = key % 26;
        for(int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if ((ch >= 65 && ch<= 90)||(ch >= 97 && ch <=122))  { 
                if ((ch >= (90 - (key-1)) && ch <= 90)||(ch >= (122 - (key-1)) && ch <= 122)) {
                    s += (char)(ch - (26 - key));
                }
                else {
                    s += (char)(ch + key);
                }
            }
            else {
                s += ch;
            }
        }
        return s;
    }

    public static String decryptCaesarKey(String message, int key) {
        String s = "";
        key = key % 26;
        for(int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if ((ch >= 65 && ch<= 90)||(ch >= 97 && ch <=122))  { 
                if ((ch >= 65 && ch <= (65 + (key-1)))||(ch >= 97 && ch <= (97 + (key-1)))){
                    s += (char)(ch + (26 - key));
                }
                else {
                    s += (char)(ch - key);
                }
            }
            else {
                s += ch;
            }
        }
        return s;
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
