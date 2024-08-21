import java.util.Scanner;

public class AgeException {

   public static void AgeInterrupt(int age){
       if(age>18&& age <80){
           System.out.println("Print valid for pan:");
       }
       else {
           System.out.println("Not valid");
           throw new ArithmeticException("Not valid Pan");
       }

    }
    public static void main(String[] args) {
        System.out.println("Enter Age:");
        try{
            Scanner sc= new Scanner(System.in);
            int age= sc.nextInt();
            AgeInterrupt(age);
        }catch(Exception e){
            System.out.println("Error "+e.getMessage());
                }
    }
}
