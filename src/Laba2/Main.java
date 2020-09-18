package Laba2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //task3
        System.out.print("Задание 1");
        int[] array_for = {34, 11, 55, 44};
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += array_for[i];
        }
        System.out.println("Сумма массива циклом for: " + sum);

        int[] array_while = {433, 232, 5555};
        int sum_second = 0, x = 0;
        while (x < 3) {
            sum_second += array_while[x];
            x++;
        }
        System.out.println("Сумма массива циклом while: " + sum_second);

        int[] array_while_do = {534534, 432423, 75765};
        int sum_third = 0, y = 0;
        do {
            sum_third += array_while_do[y];
            y++;
        } while (y < 3);
        System.out.println("Сумма массива циклом do-while: " + sum_third);

        //task4
        System.out.print("args task4: ");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        //task5
        System.out.print("\nРяд 10 чисел: ");
        double xy;
        for (int i = 1; i <= 10; i++) {
            xy = 1.0 / i;
            String yyy = String.format("%.2f", xy);
            System.out.print(yyy + " ");
        }

        //task6
        System.out.print("\nСортировка: \n");
        int[] bbb;
        bbb = new int[5];
        System.out.print("Рандомный массив: ");
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            bbb[i] = random.nextInt(100);
            System.out.print(bbb[i] + " ");
        }
        System.out.println("\nОтсортированный массив: ");
        for (int i = 0; i < bbb.length; i++) {
            int min = bbb[i];
            int minId = i;
            for (int j = i + 1; j < bbb.length; j++) {
                if (bbb[j] < min) {
                    min = bbb[j];
                    minId = j;
                }
            }
            int temp = bbb[i];
            bbb[i] = min;
            bbb[minId] = temp;
            System.out.print(bbb[i] + " ");
        }
        //task7
        System.out.println("\nФакториал: " + calculate(5));
    }
    static int calculate(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
}
