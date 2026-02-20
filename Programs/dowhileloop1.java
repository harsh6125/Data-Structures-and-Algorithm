
import java.util.*;

public class dowhileloop1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int count = 0;

            System.out.println("Enter a number:");
            int n = sc.nextInt();
            do {
                n = n / 10;
                count++;
            } while (n > 0);
            System.out.println("The number of digits is: " + count);
            sc.close();

        }
    }
}
