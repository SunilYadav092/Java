public class RightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;  // number of rows
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();  // move to the next line
        }
    }
}
