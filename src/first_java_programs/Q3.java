package first_java_programs;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double p,t,r;
        System.out.println("Enter principal");
        p = in.nextDouble();
        System.out.println("Enter time");
        t = in.nextDouble();
        System.out.println("Enter rate");
        r = in.nextDouble();
        double si = (p*t*r)/100;
        System.out.println(si);
    }
}
