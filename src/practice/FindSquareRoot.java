package practice;

import java.util.Scanner;

public class FindSquareRoot {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ax^2 + bx + c ");

        System.out.print("a= ");
        int a = enterIntegerNumber();


        System.out.print("b= ");
        int b = enterIntegerNumber();

        System.out.print("c= ");
        int c = enterIntegerNumber();

        int delta = b * b - 4 * a * c;
        double x1, x2;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("\nx1= " + x1 + "\nx2= " + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("\nx= " + x1);
        } else System.out.println("equation has no real roots");
    }

    public static int enterIntegerNumber() {
        int x;
        try {
            x = scan.nextInt();
        } catch (Exception e) {
            String str = scan.next();
            System.out.print("error!!\nenter an integer number: ");
            x = enterIntegerNumber();
        }
        return x;
    }
}
