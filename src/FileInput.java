import java.io.*;

public class FileInput {
    public static void main(String[] args) {

        try{
            FileInputStream   flieinput = new FileInputStream("C:\\Users\\ramas\\Desktop\\Myname.txt");
            byte []buffer = new byte[1024];
            int bytesreads=0;
            while((bytesreads= flieinput.read(buffer))!=-1){
                System.out.println(new String(buffer,0,bytesreads));
                flieinput.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
