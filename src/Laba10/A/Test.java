package Laba10.A;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Scanner console = new Scanner(System.in);
        System.out.print("K: ");
        int k = console.nextInt();
        sum.setK(k);
        System.out.print("S: ");
        int s = console.nextInt();
        sum.setS(s);

        sum.Count();
    }
}