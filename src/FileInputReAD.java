import java.io.*;
public class FileInputReAD{
    public static void main (String [] args){
        try{
            FileInputStream fileInput = new FileInputStream("C:\\Users\\ramas\\Desktop\\Myname.txt");
            byte [] buffer = new byte[1024];
            int bytereads= 0;
            while((bytereads = fileInput.read(buffer)) != -1){
                System.out.println(new String(buffer,0,bytereads));
            }
            fileInput.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}