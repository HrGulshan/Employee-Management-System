
package employee.management.system;
/**
 *
 * @author Gulshan kumar 
 */ 
import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener
{ 
    // for random ID No. 
    
    Random ran= new Random();
    int number = ran.nextInt(999999);
    
    // Global dicleration 
    JTextField tfname,tffname,tfaddress,tfPhone,tfAadhar,tfEMail,tfsalary,tfDesignation;
    JDateChooser dcdob;
    JComboBox cbeducation;
    JLabel lblEmployee;
    JButton add,back;
    
    AddEmployee()
    {
     // Background Color 
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);
    
    //Heading
    JLabel heading = new JLabel("Add Employee detail's");
    heading.setBounds(320,30,500,50);
    heading.setFont(new Font ("SAN_SERIF",Font.BOLD,25));
    add(heading);
    
    // Lable -> Name 
    
    JLabel labelname = new JLabel("Name");
    labelname.setBounds(50,150,150,30);
    labelname.setFont(new Font("serif",Font.PLAIN,20));
    add(labelname);
    
    //text feild-> name
    
     tfname = new JTextField();
    tfname.setBounds(200,150,150,30);
    add(tfname);
    
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
     dcdob = new JDateChooser();
     dcdob.setBounds(200,200,150,30);
     add(dcdob);
     
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
    String courses[]={"BBA","BCA","BA","BSc","B.Com","B.Tech","MBA","MCA","MSC","MA","M.Com","PHD"};
     cbeducation = new JComboBox(courses);
    cbeducation.setBackground(Color.WHITE);
    cbeducation.setBounds(600,300,150,30);
    add(cbeducation);
    
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
    tfAadhar = new JTextField();
    tfAadhar.setBounds(600,350,150,30);
    add(tfAadhar);
    
    // Lable -> Employee Id 
    JLabel labelEmployee   = new JLabel("Employee Id   ");
    labelEmployee.setBounds(50,400,150,30);
    labelEmployee.setFont(new Font("serif",Font.PLAIN,20));
    add(labelEmployee );
    
    //  Random Employee  Id 
    lblEmployee   = new JLabel("" + number);
    lblEmployee.setBounds(200,400,150,30);
    lblEmployee.setFont(new Font("serif",Font.PLAIN,20));
    add(lblEmployee );
    
    // Button add  detils of Employee
       add  = new JButton("Add Detil's ");
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
            String name = tfname.getText();
            String fname = tffname.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfPhone.getText();
            String Email= tfEMail.getText();
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfDesignation.getText();
            String aadhar = tfAadhar.getText();
            String Empid = lblEmployee.getText();
            
              //  Exception handling
            try
            {
                Conn conn = new Conn();
                String query = "insert into  employee (name,fname,dob,salary,address,phone,Email,education,designation,aadhar,Emp_id) values('"+name+"','"+fname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+Email+"','"+education+"','"+designation+"','"+aadhar+"','"+Empid+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Detials added Successfully");
              setVisible(false);
               // new Home();
               new AddEmployee();
                
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
        new AddEmployee();
    }
}
