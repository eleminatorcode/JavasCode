class C implements Runnable{
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
class D implements Runnable{
    public void run(){
        for (int i =0;i<10;i++){
            System.out.println("hello");
            //Waiting for Thread
            try {
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.getStackTrace();
            }
        }
    }

}
public class MultiThreadRunable {
    public static void main(String[] args) {
        Runnable ob1= new C();
        Runnable ob2 =new D();
        Thread t1 =new Thread(ob1);
        Thread t2 =new Thread(ob2);

        t1.start();
        t2.start();
    }
}
