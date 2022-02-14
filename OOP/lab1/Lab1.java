public class Lab1 {
    public static void main(String[] args) {
        /* Номер залікової книжки: 1525
        C2 = 1; операція O1 = "+"
        C3 = 1; C = 1
        C5 = 0; операція O2 = "*"
        C7 = 6; тип i та j - double
        C = C3; */
        final int C = 1;
        final int a = 0;
        final int b = 0;
        final int n = 10;
        final int m = 10;

        double S = 0;
        for (double i = a; i <= n; i++) {
            if(i + C == 0) {
                System.out.println("Error! Division by zero.");
                break;
            }
            for (double j = b; j <= m; j++) {
                S += (i * j) / (i + C);
            }
        }
        System.out.println("S = " + S);
    }
}
