import java.io.FileOutputStream;
import java.io.IOException;
public class FileWrite {
    public static void main(String [] args ){
        try {
            FileOutputStream FileWrite = new FileOutputStream("C:\\Users\\ramas\\Desktop\\Myname.txt",true);
            String Write ="\n ITsANother Write in File Is done \n";
            byte [ ]buffer=Write.getBytes();
            FileWrite.write(buffer);
            FileWrite.close();
            System.out.println("Write Successfully");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}