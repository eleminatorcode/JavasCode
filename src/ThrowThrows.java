public class ThrowThrows {
    public static void fun() throws IllegalAccessException{
        System.out.println("IllegalAccessException");
        throw new IllegalAccessException("demo");

    }

    public static void main(String[] args) {
        try {
            fun();
        }
        catch (IllegalAccessException e){
            System.out.println("caught in main");
        }
    }
}
