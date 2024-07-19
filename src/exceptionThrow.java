//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class exceptionThrow {
    public exceptionThrow() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = sc.nextInt();
        if (age > 100) {
            try {
                throw new MyException();
            } catch (Exception var4) {
                System.out.println("NOT VALID!");
            }
        }

    }

    static class MyException extends Exception {
        MyException() {
        }
    }
}
