interface   AA{
    void hello();

}
interface BB
{
    void hi();
}
class CC implements AA,BB{
   public void hi(){
        System.out.println("Hi");
    }
     public void hello(){
        System.out.println("HEllo");
    }
}

public class AbstractionTHWinterface {
    public static void main(String [] args){

        AA obj;
        obj = new CC();
        BB obj1;
        obj1 = new CC();


        obj.hello();
        obj1.hi();

    }
}
