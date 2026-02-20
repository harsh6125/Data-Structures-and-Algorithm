
import java.util.*;

public class whileloop2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int fact = 1;
            int i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("The factorial is: " + fact);

        }
    }
}
