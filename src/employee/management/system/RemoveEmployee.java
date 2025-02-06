
package employee.management.system;
/**
 *
 * @author Gulshan Kumar
 */
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class RemoveEmployee extends JFrame implements ActionListener 
{
    Choice cEmpid;
    JButton delete,back;
        
    RemoveEmployee()
    {
         // Frame Background
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Lable 
        JLabel labelempid = new JLabel("Emp Id  ");
        labelempid.setBounds(50,50,100,30);
        labelempid.setFont(new Font("serif",Font.PLAIN,20));
        add(labelempid);
        
        //Choice
        cEmpid = new Choice();
        cEmpid.setBounds(200,50,150,30);
       
        add(cEmpid);
        
        // Employee Id contain  
        // Exception 
        try
        {
            Conn c= new Conn();
            String query = "select distinct Emp_id from employee";
            ResultSet rs = c.s.executeQuery(query);
            cEmpid.add("--Select--");
            while(rs.next())
            {
                cEmpid.add(rs.getString("Emp_id"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        // Lable -> Name 
    
    JLabel labelname = new JLabel("Name");
    labelname.setBounds(50,100,100,30);
    labelname.setFont(new Font("serif",Font.PLAIN,20));
    add(labelname);
    
    //text feild-> name
    
     JLabel lblname = new JLabel();
    lblname.setBounds(200,100,100,30);
    add(lblname);
    
    
    // Lable -> Phone
    
    JLabel labelPhone = new JLabel("Phone NO.  ");
    labelPhone.setBounds(50,150,100,30);
    labelPhone.setFont(new Font("serif",Font.PLAIN,20));
    add(labelPhone);
    
    //text feild-> Phone
    
    JLabel lblphone = new JLabel();
    lblphone.setBounds(200,150,100,30);
    add(lblphone);
    
      // Lable -> E-Mail 
    
    JLabel labelEMail  = new JLabel("E-Mail ");
    labelEMail.setBounds(50,200,100,30);
    labelEMail.setFont(new Font("serif",Font.PLAIN,20));
    add(labelEMail );
    
    //text feild-> E-Mail 
    
    JLabel lblemail = new JLabel();
    lblemail.setBounds(200,200,100,30);
    add(lblemail);
    
   
       
        
        cEmpid.addItemListener(new ItemListener()
        {
           public void itemStateChanged(ItemEvent ie)
           {
              // Exception 
        try
        {
            
            if(cEmpid.getSelectedItem().equalsIgnoreCase("--Select--"))
            {
               lblname.setText("");
               lblphone.setText("");
               lblemail.setText("");
            }
            else
            {
                
           
            Conn c= new Conn();
            String query = "select  name,phone,Email from employee where Emp_id ='"+cEmpid.getSelectedItem()+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next())
            {
               lblname.setText(rs.getString("name"));
               lblphone.setText(rs.getString("phone"));
               lblemail.setText(rs.getString("Email"));
            }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
           }
        });
        
        // Delete Button 
        delete = new JButton("Delete");
        delete.setBounds(80,300,100,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.WHITE);
        delete.addActionListener(this);
        add(delete);
        
          // Back Button 
        back = new JButton("BACK");
        back.setBounds(220,300,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
      
        // Front image //
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/delete.png"));
        Image i2 = i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,600,400);
        add(image);     
        // Frame size
        setSize(1000,400);
        setLocation(300,150);
        setVisible(true);
          // Frame Background    
    }
    
    
    public void actionPerformed(ActionEvent ae)
    {
      if (ae.getSource() == delete)
      {
          try
          {
              // delete data
             Conn c= new Conn();
             String query = "delete from employee where Emp_id = '"+cEmpid.getSelectedItem()+"'";
             c.s.executeUpdate(query);
             // popup
             JOptionPane.showMessageDialog(null,"Employee Information Deleted Sucessfully");
             setVisible(false);
             new RemoveEmployee();
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
      }
      else
      {
          setVisible(false);
          new Home();
      } 
    }        
    public static void main(String []args)
    {
        new RemoveEmployee();
    }   
}
                                                                                                                                                                                                                                                                                                                                                                                                                    