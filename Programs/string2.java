
import java.util.*;

public class string2 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter a word :");
            String str = scan.nextLine();

            if (!str.isEmpty()) {
                char firstChar = str.charAt(0);
                if (!Character.isDigit(firstChar)) {
                    char lowerFirstChar = Character.toLowerCase(firstChar);
                    if (lowerFirstChar == 'a' || lowerFirstChar == 'e' || lowerFirstChar == 'i' || lowerFirstChar == 'o' || lowerFirstChar == 'u') {

                        System.out.println("The first letter is a vowel.");
                    } else {
                        System.out.println("The first letter is a consonant.");
                    }
                } else {
                    System.out.println("The string starts with a digit.");
                }
            } else {
                System.out.println("The string is empty.");
            }
            scan.close();
        }

    }
}
