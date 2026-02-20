import java.util.*;

public class string3{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a String :");
            String str = sc.nextLine();
            int len = str.length();
            if (len>5) {
                System.out.println("Length is Greater than 5");
            }
            else {
                System.out.println("Length is less than or equal to 5");

            }

    
    }
}
}