
import java.util.*;

public class arrays3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter two numbers :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.println(a + " is greater");
            } else if (b > a) {
                System.out.println(b + " is greater");
            } else {
                System.out.println("Both are equal");
            }
        }
    }

}
