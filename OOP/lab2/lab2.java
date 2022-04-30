public class lab2 {
    public static void main(String[] args) {
        /* Номер залікової книжки 1525
        C5 = 0; Дія з матрицею(ями): C=a×B, a - const
        C7 = 6; Тип елементів матриці: float
        C11 = 7; Дія з матрицею С:
        Обчислити суму найбільших елементів в стовпцях матриці з непарними номерам
        та найменших елементів в стовпцях матриці з парними номерами*/

        // Задамо значення константі a та матриці B, ініціалізуймо матрицю C
        final int a = 2;
        float[][] B = {
                {1.2f, 0f, 9.7f, 4f},
                {5.6f, 6f, 10.1f, 2f},
                {3.26f, 2.8f, 5f, 1.3f},
                {15.5f, -2.3f, 13f, 16f}
        };
        float[][] C = new float[B.length][B[0].length];

        // Заповнимо матрицю C значеннями
        System.out.println("Матриця C:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = a * B[i][j];
                System.out.printf("%8.2f ", C[i][j]);
            }
            System.out.println();
        }

        // Обчислимо суму
        float Sum = 0f;
        for (int j = 0; j < C[0].length; j++) {
            float min = C[0][j];
            float max = C[0][j];
            for (float[] floats : C) {
                if ((((j + 1) % 2) == 1) && (floats[j] > max)) max = floats[j];
                else if (floats[j] < min) min = floats[j];
            }
            if (((j + 1) % 2) == 1) Sum += max;
            else Sum += min;
        }
        System.out.println("Сума = " + Sum);
    }
}
