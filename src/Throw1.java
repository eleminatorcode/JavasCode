//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

 class Throw1 {
    public static void fun() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught in fun().");
            throw e;
        }
    }
        public static void main (String[]args){
            try {
                fun();
            } catch (NullPointerException e){
                System.out.println("caught in main");
        }
    }
    }