public class lab2 {
    public static void main(String[] args) {
        /* Номер залікової книжки 1525
        C5 = 0; Дія з матрицею(ями): C=a×B, a - const
        C7 = 6; Тип елементів матриці: float
        C11 = 7; Дія з матрицею С:
        Обчислити суму найбільших елементів в стовпцях матриці з непарними номерам
        та найменших елементів в стовпцях матриці з парними номерами*/

        // Задамо значення константі a та матриці B, ініціалізуймо матрицю C
        final int a = 1;
        final float[][] B = {
                {-50f, 10f, 0f, 25f},
                {1.2f, 5f, 1.8f, 0.9f},
                {1.8f, 11f, 1.9f, 0f},
                {-90f, 1f, -23f, 100f}
        };
        float[][] C = new float[B.length][B[0].length];

        // Заповнимо матрицю C значеннями
        System.out.println("\nМатриця C:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = a * B[i][j];
                System.out.printf("%8.2f ", C[i][j]);
            }
            System.out.println();
        }

        // Обчислимо суму (виправлено)
        float Sum = 0f;
        for (int i = 0; i < C[0].length; i += 2) {
            float min = C[0][i];
            for (int j = 0; j < C.length; j++) {
                if (C[j][i] < min) {
                    min = C[j][i];
                }
            }
            Sum += min;
        }
        for (int i = 1; i < C[0].length; i += 2) {
            float max = C[0][i];
            for (int j = 0; j < C.length; j++) {
                if (C[j][i] > max) {
                    max = C[j][i];
                }
            }
            Sum += max;
        }
        System.out.println("\nСума = " + Sum);
    }
}
