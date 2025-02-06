
package employee.management.system;
/**
 *
 * @author Gulshan kumar 
 */ 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UpdateEmployee extends JFrame implements ActionListener
{ 
    
    // Global dicleration 
    JTextField tfeducation,tffname,tfaddress,tfPhone,tfAadhar,tfEMail,tfsalary,tfDesignation;
    JLabel lblEmployee;
    JButton add,back;
    String Emp_id;
    
    
   
    UpdateEmployee(String EMpid)
    {
        this.Emp_id = EMpid; 

    // Background Color 
        
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    //Heading
    
    JLabel heading = new JLabel("Update Employee detail's");
    heading.setBounds(320,30,500,50);
    heading.setFont(new Font ("SAN_SERIF",Font.BOLD,25));
    add(heading);
    
    // Lable -> Name 
    
    JLabel labelname = new JLabel("Name");
    labelname.setBounds(50,150,150,30);
    labelname.setFont(new Font("serif",Font.PLAIN,20));
    add(labelname);
    
    //text feild-> name
    
     JLabel lblname = new JLabel();
    lblname.setBounds(200,150,150,30);
    add(lblname);
    
    // Lable -> Fathers Name 
    
    JLabel labelfname = new JLabel("Father's Name");
    labelfname.setBounds(400,150,150,30);
    labelfname.setFont(new Font("serif",Font.PLAIN,20));
    add(labelfname);
    
    //text feild-> fathers name
    
     tffname = new JTextField();
    tffname.setBounds(600,150,150,30);
    add(tffname);
    
    
    // Lable -> DOB 
    
    JLabel labeldob = new JLabel("Date Of Barth ");
    labeldob.setBounds(50,200,150,30);
    labeldob.setFont(new Font("serif",Font.PLAIN,20));
    add(labeldob);
    
    // Celander 
    
     JLabel lbldob = new JLabel();
     lbldob.setBounds(200,200,150,30);
     add(lbldob);
     
    // Lable -> Salary 
    
    JLabel labelsalary = new JLabel("Salary");
    labelsalary.setBounds(400,200,150,30);
    labelsalary.setFont(new Font("serif",Font.PLAIN,20));
    add(labelsalary);
    
    //text feild-> salary
    
     tfsalary = new JTextField();
    tfsalary.setBounds(600,200,150,30);
    add(tfsalary);
    
    // Lable -> Address 
    JLabel labeladdress = new JLabel("Address");
   labeladdress.setBounds(50,250,150,30);
    labeladdress.setFont(new Font("serif",Font.PLAIN,20));
    add(labeladdress);
    
    //text feild-> address
    
     tfaddress = new JTextField();
    tfaddress.setBounds(200,250,150,30);
    add(tfaddress);
    
    // Lable -> Phone
    
    JLabel labelPhone = new JLabel("Phone NO.  ");
    labelPhone.setBounds(400,250,150,30);
    labelPhone.setFont(new Font("serif",Font.PLAIN,20));
    add(labelPhone);
    
    //text feild-> Phone
    
    tfPhone = new JTextField();
    tfPhone.setBounds(600,250,150,30);
    add(tfPhone);
    
    // Lable -> E-Mail 
    
    JLabel labelEMail  = new JLabel("E-Mail ");
    labelEMail.setBounds(50,300,150,30);
    labelEMail.setFont(new Font("serif",Font.PLAIN,20));
    add(labelEMail );
    
    //text feild-> E-Mail 
    
  tfEMail = new JTextField();
    tfEMail.setBounds(200,300,150,30);
    add(tfEMail);
    
      // Lable -> Education
    
    JLabel labelEducation = new JLabel("Higest Education   ");
    labelEducation.setBounds(400,300,150,30);
    labelEducation.setFont(new Font("serif",Font.PLAIN,20));
    add(labelEducation);
    
    //Drop Down -> Education
     tfeducation = new JTextField();
    tfeducation.setBounds(600,300,150,30);
    add(tfeducation);
    
    // Lable -> Designation 
    
    JLabel labelDesignation  = new JLabel("Designation ");
    labelDesignation .setBounds(50,350,150,30);
    labelDesignation .setFont(new Font("serif",Font.PLAIN,20));
    add(labelDesignation );
    
    //text feild-> Designation 
    
   tfDesignation  = new JTextField();
    tfDesignation .setBounds(200,350,150,30);
    add(tfDesignation );
    
    // Lable -> Aadhar  
    
    JLabel labelAadhar  = new JLabel("Aadhar NO.  ");
    labelAadhar.setBounds(400,350,150,30);
    labelAadhar.setFont(new Font("serif",Font.PLAIN,20));
    add(labelAadhar );
    
    //text feild-> Aadhar 
    
    JLabel lblaadhar = new JLabel();
    lblaadhar.setBounds(600,350,150,30);
    add(lblaadhar);
    
    // Lable -> Employee Id 
    
    JLabel labelEmployee   = new JLabel( "Employee Id" );
    labelEmployee.setBounds(50,400,150,30);
    labelEmployee.setFont(new Font("serif",Font.PLAIN,20));
    add(labelEmployee );
    
    //  Random Employee  Id 
    
    lblEmployee   = new JLabel();
    lblEmployee.setBounds(200,400,150,30);
    lblEmployee.setFont(new Font("serif",Font.PLAIN,20));
    add(lblEmployee );
    
    try
    {  Conn c = new Conn();
        String query = "select * from  employee where Emp_id = '"+Emp_id+"'";
        ResultSet rs = c.s.executeQuery(query);
        while(rs.next())
        {
            lblname.setText(rs.getString("name"));
            tffname.setText(rs.getString("fname"));
            lbldob.setText(rs.getString("dob"));
            tfsalary.setText(rs.getString("salary"));
            tfaddress.setText(rs.getString("address"));
            tfPhone.setText(rs.getString("phone"));
            tfEMail.setText(rs.getString("Email"));
            tfeducation.setText(rs.getString("education"));
            tfDesignation.setText(rs.getString("designation"));
            lblaadhar.setText(rs.getString("aadhar"));
             lblEmployee.setText(rs.getString("Emp_id"));               
        }
    }catch(Exception e)
    {
       e.printStackTrace();
    
    }
    // Button add  detils of Employee
       add  = new JButton("Update Detil's ");
        add.setBounds(250,550,150,40);
        add.addActionListener(this);
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
       add(add);
        
    // Button Back
      back  = new JButton("Back");
      back .setBounds(450,550,150,40);
       back .addActionListener(this);
      back.setBackground(Color.BLACK);
      back.setForeground(Color.WHITE);
       add(back);    
    
    // Frame
    setSize(900,700);
    setLocation(300,50);
    setVisible(true);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if(ae.getSource() == add )
        {    
            String salary = tfsalary.getText();
            String fname = tffname.getText();
            String address = tfaddress.getText();
            String phone = tfPhone.getText();
            String Email= tfEMail.getText();
            String education = tfeducation.getText();
            String designation = tfDesignation.getText();
       
              //  Exception handling
            try
            {
                Conn conn = new Conn();
                //update value
                String query = "Update employee set fname = '"+fname+"',salary= '"+salary+"',address='"+address+"',phone='"+phone+"',Email='"+Email+"',education='"+education+"',designation='"+designation+"'where Emp_id='"+Emp_id+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Detials Updated  Successfully");
                setVisible(false);
                new Home();
                
            }catch(Exception e)
            {
                e.printStackTrace();
            }  
        }else
        {
            setVisible(false);
            new Home();   
        }
    }
    public static void main(String [] args)
    {
        new UpdateEmployee("");
    }
}
