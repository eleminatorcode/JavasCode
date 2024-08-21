import java.io.FileOutputStream;
import java.io.IOException;

public  class Outputfile {
    public static void main(String[] args) {
        try{
            FileOutputStream fileoutput= new FileOutputStream("C:\\Users\\ramas\\Desktop\\Myname.txt",true);
            String data="This was yours now its mine ";
            byte []buffer = data.getBytes();
            fileoutput.write(buffer);
            fileoutput.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    finally{
        System.out.println("Written completed");
    }
    }
}