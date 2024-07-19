//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.util.Scanner;

public class pascal {
    public pascal() {
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of row to print:-");
        Scanner sc = new Scanner(System.in);
        int $Row = sc.nextInt();
        int i = $Row;

        for(int k = 1; k <= i; ++k) {
            int vprint;
            for(vprint = 0; vprint <= i - k; ++vprint) {
                System.out.print(" ");
            }

            vprint = 1;

            for(int j = 1; j <= k; ++j) {
                System.out.print(vprint);
                System.out.print(" ");
                vprint = vprint * (k - j) / j;
            }

            System.out.println();
        }

    }
}
