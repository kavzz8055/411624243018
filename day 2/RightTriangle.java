public class RightTriangle {
    public static void main(String[] args) {
        int n = 5;   // number of rows

        for (int i = 1; i <= n; i++) {        // rows
            for (int j = 1; j <= i; j++) { 
                   // columns
                System.out.print(" * ");
            }
            System.out.println(); // next line
        }
    }
}
