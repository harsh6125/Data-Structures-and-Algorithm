import java.util.*;
public class loop2 {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            int factorial = 1;
            for(int i = 1; i <= n; i++){
                factorial *= i;
            }
            System.out.println("The factorial is: " + factorial);

        }
    }
}
