package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Dashboard extends JFrame implements ActionListener {
    
    String username;
    JButton addPersonalDetails,viewPersonalDetails,about,calculater,notepad,payments,viewbookedhotel,destination,bookhotel,updatePersonalDetails,viewhotels,bookpackage,deletePersonalDetails,Checkpackage,viewpackage;
    Dashboard( String username)
    {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,50);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 =i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);
              
        JLabel heading =new JLabel("Dashboard");
        heading.setBounds(80,10 , 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD, 25));
        p1.add(heading);
        
        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,50,270,900);
        add(p2);
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300, 40);
        addPersonalDetails.setBackground(new Color(0,0,102));
        addPersonalDetails.setForeground(Color.WHITE);
        addPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,17));
        addPersonalDetails.setMargin(new Insets(0,0,0,65));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 35, 300, 50);
        updatePersonalDetails.setBackground(new Color(0,0,102));
        updatePersonalDetails.setForeground(Color.WHITE);
        updatePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,17));
        updatePersonalDetails.setMargin(new Insets(0,0,0,39));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Personal Details");
        viewPersonalDetails.setBounds(0, 80, 300, 50);
        viewPersonalDetails.setBackground(new Color(0,0,102));
        viewPersonalDetails.setForeground(Color.WHITE);
        viewPersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,17));
        viewPersonalDetails.setMargin(new Insets(0,0,0,60));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 120, 300, 50);
        deletePersonalDetails.setBackground(new Color(0,0,102));
        deletePersonalDetails.setForeground(Color.WHITE);
        deletePersonalDetails.setFont(new Font("Tahoma",Font.PLAIN,17));
        deletePersonalDetails.setMargin(new Insets(0,0,0,45));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        Checkpackage = new JButton("Check Package");
        Checkpackage.setBounds(0, 160, 300, 50);
        Checkpackage.setBackground(new Color(0,0,102));
        Checkpackage.setForeground(Color.WHITE);
        Checkpackage.setFont(new Font("Tahoma",Font.PLAIN,17));
        Checkpackage.setMargin(new Insets(0,0,0,110));
        Checkpackage.addActionListener(this);
        p2.add(Checkpackage);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 200, 300, 50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,17));
        bookpackage.setMargin(new Insets(0,0,0,115));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Package");
        viewpackage.setBounds(0, 240, 300, 50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,17));
        viewpackage.setMargin(new Insets(0,0,0,115));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 280, 300, 50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,17));
        viewhotels.setMargin(new Insets(0,0,0,127));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
         
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 320, 300, 50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,17));
        bookhotel.setMargin(new Insets(0,0,0,134));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0, 360, 300, 50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,17));
        viewbookedhotel.setMargin(new Insets(0,0,0,73));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destination = new JButton("Destination");
        destination.setBounds(0, 400, 300, 50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.PLAIN,17));
        destination.setMargin(new Insets(0,0,0,127));
        destination.addActionListener(this);
        p2.add(destination);
        
        payments = new JButton("Payments");
        payments.setBounds(0, 440, 300,45);
        payments.setBackground(new Color(0,0,102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN,17));
        payments.setMargin(new Insets(0,0,0,140));
        payments.addActionListener(this);
        p2.add( payments);
        
        calculater = new JButton("Calculater");
        calculater.setBounds(0, 480, 300, 45);
        calculater.setBackground(new Color(0,0,102));
        calculater.setForeground(Color.WHITE);
        calculater.setFont(new Font("Tahoma",Font.PLAIN,17));
        calculater.setMargin(new Insets(0,0,0,140));
        calculater.addActionListener(this);
        p2.add( calculater);
         
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 515, 300, 45);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,17));
        notepad.setMargin(new Insets(0,0,0,146));
        notepad.addActionListener(this);
        p2.add( notepad);
         
        
        about = new JButton("About");
        about.setBounds(0, 555, 300, 45);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,17));
        about.setMargin(new Insets(0,0,0,162));
        about.addActionListener(this);
        p2.add( about);
        
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1300, 700, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image= new JLabel(i6);
        image.setBounds(0,0,1300,700);
        add(image);
        
        
        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(400, 55, 1000, 70);
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.PLAIN,40));
        image.add(text);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==addPersonalDetails){
            new AddCustomer(username);
    }  
         else if (ae.getSource()== viewPersonalDetails){
           new Viewcus(username);
    }
         else if (ae.getSource()== updatePersonalDetails){
           new UpdateCustomer(username);
    }
        else if (ae.getSource()== Checkpackage){
           new CheckPackage();
    }else if (ae.getSource()== bookpackage){
           new BookPackage(username);
    }else if (ae.getSource()== viewpackage){
           new ViewPackage(username);
    }else if (ae.getSource()== viewhotels){
           new CheckHotels();
    }else if (ae.getSource()== destination){
           new Destinations();
        
    }else if (ae.getSource()== bookhotel){
           new BookHotel(username);
        
    }else if (ae.getSource()== viewbookedhotel){
           new ViewBookedHotel(username);
        
    }else if (ae.getSource()== payments){
           new Payment();
        
    }else if (ae.getSource()== calculater){
        try{
            Runtime.getRuntime().exec("calc.exe");
        }catch(Exception e){
            e.printStackTrace();
        }
    }else if (ae.getSource()== notepad){
        try{
            Runtime.getRuntime().exec("notepad.exe");
        }catch(Exception e){
            e.printStackTrace();
        }
    }else if (ae.getSource() == about){
           new About();
  }
    else if (ae.getSource() == deletePersonalDetails){
           new DeleteDetails(username);
    }
  }
    public static void main(String []args)
    {
    new Dashboard("");
    }
}
