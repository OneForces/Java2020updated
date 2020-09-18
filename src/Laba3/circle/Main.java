package Laba3.circle;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Circle circle = new Circle();
	Scanner inc = new Scanner(System.in);
	int a = inc.nextInt();
	    circle.newNumb(a);
	    circle.allInfo();
    }
}
