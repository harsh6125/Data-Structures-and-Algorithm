
import java.util.*;

public class arrays1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number :");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Numer is zero ");
            } else if (n > 0) {
                System.out.println("Number is positive");
            } else {
                System.out.println("Number is negative");
            }
            sc.close();
            

        }
    }

}
