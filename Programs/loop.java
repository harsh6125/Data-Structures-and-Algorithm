
import java.util.*;

public class loop {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                System.out.println();
            }

        }

    }
}
