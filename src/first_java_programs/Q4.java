package first_java_programs;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1,n2;
        System.out.print("Enter number 1: ");
        n1 = in.nextDouble();
        System.out.print("Enter number 2: ");
        n2 = in.nextDouble();
        char op;
        System.out.print("Enter operator between \" *,-,/,+ \": ");
        op = in.next().charAt(0);
        if(op == '+')
            System.out.println(n1+n2);
        else if(op == '-')
            System.out.println(n1-n2);
        else if(op == '/')
            System.out.println(n1/n2);
        else if(op == '*')
            System.out.println(n1*n2);
        else
            System.out.println("Wrong operator");
    }
}
