//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Throw1 {
    public Throw1() {
    }

    static class example implements Runnable {
        example() {
        }

        public void run() {
            System.out.println("Thread is running");
        }

        public static void main(String[] args) {
            example e1 = new example();
            Thread thread = new Thread(e1);
            thread.start();
        }
    }
}
