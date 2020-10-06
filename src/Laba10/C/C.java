package Laba10.C;

import java.util.Scanner;

public class C {
    public static int f9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return f9(a, b - 1) + f9(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа a и b: ");
        System.out.println(f9(scanner.nextInt(), scanner.nextInt()));
        System.out.println();
    }
}