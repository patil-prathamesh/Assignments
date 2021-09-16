package first_java_programs;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n1,n2;
        System.out.print("Enter 1st number: ");
        n1 = in.nextLong();
        System.out.print("Enter 2nd number: ");
        n2 = in.nextLong();
        if(n1 > n2)
            System.out.println("Max: " + n1);
        else
            System.out.println("Max: " + n2);
    }
}
