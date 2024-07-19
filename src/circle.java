//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class circle {
    public circle() {
    }

    void area(double x) {
        System.out.print(3.14 * x * x);
    }

    void circumference(double y) {
        System.out.print(6.28 * y);
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = sc.nextDouble();
        circle c = new circle();
        System.out.println("Enter the area:");
        c.area(radius);
        System.out.print("\n");
        System.out.println("Enter the circumference:");
        c.circumference(radius);
    }
}
