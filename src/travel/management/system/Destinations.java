package travel.management.system;
import javax.swing.*;
import java.awt.*;

public class Destinations extends JFrame {
    
   Destinations()
    {
        setBounds(320,100,800,550);
       
        
       
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dest1.jpg"));
    Image i2=i1.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel image=new JLabel(i3);
    image.setBounds(600, 100, 200, 200);
    add(image);
        
        
        setVisible(true);
    }
    public static void main(String []args){
        new Destinations();
    }
    
}
