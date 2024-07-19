//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

public class percentage {
    public percentage() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of student:-");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.print("Enter Marks of maths:-");
        int maths = sc.nextInt();
        System.out.print("Enter Marks of physics:-");
        int phy = sc.nextInt();
        System.out.print("Enter Marks of chemistry:-");
        int che = sc.nextInt();
        System.out.print("Enter Marks of english:-");
        int eng = sc.nextInt();
        System.out.print("Enter Marks of hindi:-");
        int hindi = sc.nextInt();
        System.out.print(maths);
        System.out.print("\n");
        System.out.print(phy);
        System.out.print("\n");
        System.out.print(che);
        System.out.print("\n");
        System.out.print(eng);
        System.out.print("\n");
        System.out.print(hindi);
        System.out.print("\n");
        int sum = maths + che + phy + eng + hindi;
        float percentage = (float)(sum / 5);
        System.out.print(percentage);
    }
}
