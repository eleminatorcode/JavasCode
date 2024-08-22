import com.sun.java.accessibility.util.TopLevelWindowListener;

abstract class Vehicle{
    public abstract void  speed();
    public abstract void  maintenance();
    public abstract void  name();

}

class TwoWheeler extends Vehicle {
    public void speed(){
        System.out.println("Max speed is 60");
    }
    public void maintenance(){
        System.out.println("Its not To costly");

    }

    public void name(){
        System.out.println("Its TwoWheeler");
    }
}
class ThreeWheeler extends Vehicle{
    public void speed(){
        System.out.println("Max speed is 80");
    }
    public void maintenance(){
        System.out.println("Its Median costly");

    }

    public void name(){
        System.out.println("Its ThreeWheeler");
    }
}
class FourWheeler extends Vehicle{
    public void speed(){
        System.out.println("Max speed is 200");
    }
    public void maintenance(){
        System.out.println("Its to costly");

    }

    public void name(){
        System.out.println("Its FourWheeler");
    }
}


public class Abstraction {
    public static void main(String []args){
        Vehicle BMW,Bajaj,APE;
        BMW = new FourWheeler();
        BMW.speed();
        BMW.maintenance();
        BMW.name();
        Bajaj =new TwoWheeler();
        Bajaj.speed();
        Bajaj.maintenance();
        Bajaj.name();
        APE = new ThreeWheeler();
        APE.speed();
        APE.maintenance();
        APE.name();
    }
}
