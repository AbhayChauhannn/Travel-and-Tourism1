package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {

    JButton pay, back;

    Payment() {
        setBounds(350, 110, 800, 550);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 800, 550);
        add(image);

        pay = new JButton("pay");
        pay.setBounds(500, 0, 70, 30);
        pay.addActionListener(this);
        image.add(pay);

        back = new JButton("Back");

        back.setBounds(620, 0, 70, 30);
        back.addActionListener(this);
        image.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == pay) {
            setVisible(false);
            new Paytm();
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Payment();

    }

}
