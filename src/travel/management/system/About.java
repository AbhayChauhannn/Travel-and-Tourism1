package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {

    About() {
        setBounds(350, 120, 500, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(190, 25, 100, 40);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(l1);

        String s = "The process of the system we can consider here, can maintain the databases of the system. We can insert to the databases and retrieve all the information \n"
                + "The main aim of this project is to help the tourists to manage their trip. It makes all operation of the tour company easy and accurate. The standalone platform makes tourism management easy by handling requests and providing servers for the customers located at different parts of the various\n"
                + "citiesDifferent modules have been incorporated in this project to handle different parts and sector of the tour management field.";

        TextArea area = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20, 100, 450, 300);
        add(area);

        JButton back = new JButton("Back");
        back.setBounds(200, 420, 100, 25);
        back.addActionListener(this);
        add(back);
     
        
        
        setVisible(true);
    }

    
    public void actionPerformed(ActionEvent ae){
            setVisible(false);
            
    }
    
    public static void main(String[] args) {
        new About();
    }

}
