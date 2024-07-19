//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class exceptionThrows {
    public exceptionThrows() {
    }

    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            getTheIndex(a);
        } catch (Exception var3) {
            System.out.println("Error in this");
        }

    }

    static int getTheIndex(int[] a) throws ArithmeticException {
        return a[3];
    }
}
