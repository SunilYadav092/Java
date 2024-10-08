public class Simple2DArray {
    public static void main(String[] args) {
        String[][] names = {
            {"John", "Doe"},
            {"Jane", "Smith"},
            {"Mike", "Johnson"}
        };
        System.out.println("2D array of strings:");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " ");
            }
            System.out.println(); 
            }
    }
}
