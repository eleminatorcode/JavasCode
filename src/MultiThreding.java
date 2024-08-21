
class A extends Thread{
    public void run(){
        for (int i =0;i<10;i++){
            System.out.println("hi");
            //Waiting for Thread
            try {
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
    }
}
class B extends Thread {
    public void run(){
        for (int i=0;i<10;i++) {
            System.out.println("Hello");
      //Waiting state
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }
}
public class MultiThreding {
    public static void main(String[] args) {
        A obj1 =new A();
        B obj2= new B();
        System.out.println(obj2.getPriority());
        obj1.start();
        obj2.setPriority(6);
        System.out.println(obj2.getPriority());
        obj2.start();
    }
}
