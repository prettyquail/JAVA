import java.awt.*;  
import java.awt.event.*;  
public class ButtonExample {  
public static void main(String[] args) {  
    Frame f=new Frame("Button Example");  
    final TextField tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("MTech");  
    Button c=new Button("MCA"); 
    b.setBounds(50,100,60,30);  
    c.setBounds(100,100,60,30); 
    b.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("You selected MTech course.");  
        }  
    }); 
    c.addActionListener(new ActionListener(){  
    public void actionPerformed(ActionEvent e){  
            tf.setText("You selected MCA course.");  
        }  
    }); 
    f.add(b);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   

    f.add(c);f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);
}  
}  
