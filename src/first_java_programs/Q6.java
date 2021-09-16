package first_java_programs;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rupee;
        System.out.print("Enter amount in rupee: ");
        rupee = in.nextDouble();
        double dollar = rupee/73.42;
        System.out.printf("Dollar value: %.3f",dollar);
    }
}
