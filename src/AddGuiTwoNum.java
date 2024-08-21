import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Addition extends JFrame implements ActionListener{
    JTextField t1,t2;
    JLabel j1;
    JButton b;
    public Addition(){
        t1= new JTextField(20);
         t2 = new JTextField(20);
         j1=new JLabel("RESULT:");
         b= new JButton("OK");
        add(t1);
        add(t2);
        add(j1);
        add(b);
        /* ActionListener =new ActionListener ()
{
 public void actionPerformed(ActionEvent ae){
  int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value= num1+num2;
        j1.setText(value+"");


};
         */
        b.addActionListener(this);
        setLayout( new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int value= num1+num2;
        j1.setText(value+"");

    }
}

public class AddGuiTwoNum {
    public static void main(String[] args) {
        Addition obj= new Addition();
    }
}
