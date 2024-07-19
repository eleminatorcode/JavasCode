//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ThreadusingExtend {
    public ThreadusingExtend() {
    }

    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx();
        t1.start();
    }

    static class ThreadEx extends Thread {
        ThreadEx() {
        }

        public void run() {
            int a = 10;
            int b = 22;
            int result = a + b;
            System.out.println("RESULT=" + result);
        }
    }
}
