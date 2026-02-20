import java.util.*;
public class string1{    
    public static void main(String[] args) {
        System.out.println("Enter a String :");
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int len = str.length();
            if (len > 0) {
                System.out.println("Not Empty");
            } else {
                System.out.println("Empty");
            }
        }
    }
}