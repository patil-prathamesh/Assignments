package first_java_programs;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = in.nextInt();
        if(number%2 == 0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
