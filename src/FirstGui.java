import javax.swing.*;
import java.awt.*;

class ABC extends JFrame //Card Layout
{


    public ABC(){
     JLabel l= new JLabel("hello World");
     JLabel l1= new JLabel("Its my world");
     add(l);
     add(l1);
     setLayout( new FlowLayout());
     setSize(400,400);
     setVisible(true);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 }
}
public class FirstGui {
    public static void main(String[] args) {
        ABC obj= new ABC();
    }
}
