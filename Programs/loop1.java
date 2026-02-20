
import java.util.*;

public class loop1 {

    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int sum = 0;
            while (n > 0) {
                sum += n;
                n--;
            }
            System.out.println("The sum is: " + sum);
            
        }
    }
}
