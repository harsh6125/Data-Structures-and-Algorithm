//Count the number of digits in a given number using a do-while loop

import java.util.*;

public class loop4 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int count = 0;
            do {
                count++;
                n = n / 10;
            } while (n > 0);
            System.out.println("Number of digits: " + count);
        }
    }
}
