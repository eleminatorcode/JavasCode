//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class prime {
    public prime() {
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n:");
        int n = sc.nextInt();
        System.out.println("Enter the number m:");
        int m = sc.nextInt();
        int check = 0;

        for(int i = n; i < m; ++i) {
            for(int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    check = 0;
                    break;
                }

                ++check;
            }

            if (check != 0) {
                System.out.println(i);
            }
        }

    }
}
