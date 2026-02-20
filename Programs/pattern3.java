
public class pattern3 {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int n = 5; //width
        int rows = 4; //height
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
