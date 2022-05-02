import java.util.*;

public class lab3 {
    public static void main(String[] args) {
        /* Номер залікової книжки 1525
        C3 = 1; Тип текстових змінних: StringBuffer
        C17 = 12; Дія з рядком:
        Відсортувати слова заданого тексту за кількістю входжень визначеного символу в них */

        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведіть один символ, за яким відсортується масив: ");
        String symbol = sc.nextLine();

        StringBuffer string = new StringBuffer("Loaaremf ipsum doloffr sifsft amrtet, consecaatetur adipiffscing elit. FF ffF Uuu abcpsdeffg. Rrfr arb asd sfasf ffff.");
        System.out.println("Заданий текст: " + string);
        System.out.println("Символ за яким сортуються слова рядка: " + symbol);
        
        String[] a = sort(string.toString(), symbol);
        System.out.println(Arrays.toString(a));
    }

    // Створимо метод для сортування рядка
    public static String[] sort(String str, String symbol) {
        //** Метод повертає масив слів, відсортованих за кількістю входжень символа */
        if(str.equals("")) return new String[0];

        // Створимо масив слів з тексту
        str = str
                .replace(",", "")
                .replace(".", "")
                .replace("!", "")
                .replace("?", "")
                .replace(":", "")
                .replace(";", "");
        String[] array = str.split(" ");

        // Додамо кількість входжень символу до слів
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            for (int j = 0; j < array[i].length(); j++) {
                if ((array[i].substring(j, j + 1).equals(symbol.toLowerCase())) || (array[i].substring(j, j + 1).equals(symbol.toUpperCase()))) counter += 1;
            }
            array[i] += " " + counter;
        }
        // Відсортуємо масив за кількістю входжень символу
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (array.length - 1); i++) {
                int first = Integer.parseInt(array[i].substring(array[i].length() - 1));
                int second = Integer.parseInt(array[i + 1].substring(array[i + 1].length() - 1));
                if (first < second) {
                    isSorted = false;
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}
