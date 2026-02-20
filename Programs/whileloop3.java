
import java.util.*;

public class whileloop3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int rev = 0;
            while (n > 0) {
                int d = n % 10;
                rev = rev * 10 + d;
                n = n / 10;
            }
            System.out.println("Reversed number is: " + rev);

        }

    }
}
