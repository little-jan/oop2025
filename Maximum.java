package lab2;

import java.util.Scanner;

// this code is about ternary operators

public class Maximum {

//    original code:
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a: ");
//        int a = sc.nextInt();
//        System.out.print("Enter b: ");
//        int b = sc.nextInt();
//        int maximum = a;
//        if (b > a)
//            maximum = b;
//        System.out.println("Maximum: " + maximum);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int maximum = (b > a) ? b : a;

        System.out.println("Maximum: " + maximum);
    }

}
