import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Addsubs extends JFrame implements ActionListener
{
    JTextField tx1,tx2;
    JButton add1,sub;
    JLabel l1;
    public Addsubs(){
        tx1=new JTextField(15);
        tx2=new JTextField(15);
        add1=new JButton("Add");
        sub=new JButton("Sub");
        l1=new JLabel("Result");
        add(tx1);
        add(tx2);
        add(add1);
        add(sub);
        add(l1);
        add1.addActionListener(this);
        sub.addActionListener(this);
        setSize(400,400);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1= Integer.parseInt(tx1.getText());
        int num2 =Integer.parseInt(tx2.getText());
        int value1=0;
        if(ae.getSource()==add1){
            value1=num1+num2;
        }
        else{
            value1=num1-num2;
        }
        l1.setText(value1+"");
    }

}

public class AddSubGUI {
    public static void main(String[] args) {
        Addsubs obj=new Addsubs();
    }
}
