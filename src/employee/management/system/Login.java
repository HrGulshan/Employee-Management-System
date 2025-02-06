package employee.management.system;
/**
 *
 * @author Gulshan kumar 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener 
{
    JTextField tfusername,tfpassword;
    
    Login()
    {
        //Background Frame color //
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // login  image //
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/new.png"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        // username//
        JLabel lblusername = new JLabel("Username :-> ");
        lblusername.setBounds(40,20,100,30);
        add(lblusername);
        
        //Textfeild uernmae (Box) //
        tfusername = new JTextField();
        tfusername.setBounds(150,20,150,30);
        add(tfusername);
                 
        //Password //
        JLabel lblpassword = new JLabel("Password :-> ");
        lblpassword.setBounds(40,80,100,30);
        add(lblpassword);
        
          //Textfeild password (Box) //
        tfpassword = new JTextField();
        tfpassword.setBounds(150,80,150,30);
        add(tfpassword);
        
          // Click Button //
        JButton login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        //Background Frame //
        setSize(600,300);
        setLocation(450,200);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
          //  Exception handling
       try
       {        
           String username = tfusername.getText();
           String password = tfpassword.getText();
           
           Conn c = new Conn();
                    
           String query = "select * from login where username = '"+username+"'and password = '"+password+"'";
           
           if(c != null)
           {
                 
            ResultSet rs = c.s.executeQuery(query);
                          
           if(rs.next())
           {
               setVisible(false);
               new Home();
               
               //next class
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Invalid unsename or password");
               setVisible(false);
           }
           }
       }
       catch(Exception e)
               {
                   e.printStackTrace();
               }    
    }
    // Main Funcion //
    public static void main(String[] args)
    {
        new Login();
    
    }   
}
