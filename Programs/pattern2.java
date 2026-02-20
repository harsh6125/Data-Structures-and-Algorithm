public class pattern2 {
    public static void main(String[] args){
        int n = 5; // width
        int rows = 3; // height

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= n; j++) {
                // print star on borders, space inside
                if (i == 1 || i == rows || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}