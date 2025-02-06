
package employee.management.system;
/**
 *
 * @author Gulshan Kumar
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
public class ViewEmployee extends JFrame implements ActionListener
{ 
    JTable table;
    Choice cemployeeid;
    JButton search,print,update,back;
    
    ViewEmployee()
    {
         // Backgroind 
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // searching id 
        JLabel searchlbl = new JLabel("Searching By Employee Id ");
        searchlbl.setBounds(20,20,150,20);
        add(searchlbl);
        
        // Dropdoun Box
        cemployeeid = new Choice();
        cemployeeid.setBounds(180,20,150,20);
        add(cemployeeid);
        
        //  Exception handling
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            
              //  Dynamic Id 
            cemployeeid.add("All");
            while(rs.next())
            {
                cemployeeid.add(rs.getString("Emp_id"));
            }
        }catch(Exception e)
                {
                    e.printStackTrace();
                }
        
       // Table obj
        table = new JTable();
          
//  Exception handling
        try
        {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
                {
                    e.printStackTrace();
                }
           
          // ScrollBar 
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        
        // Search Button
        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
         // print Button
        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);
        
          // update Button
        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);
        
          // back Button
        back = new JButton("back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);
        
      // Frame
    setSize(900,700);
    setLocation(300,100);
    setVisible(true);   
    }
    public static void main(String []args)
    {
        new ViewEmployee();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // Event For Search  
        if(e.getSource().equals(search))
        {
          System.out.print("search tn clicked");
          
          
          if(cemployeeid.getSelectedItem().equalsIgnoreCase("All"))
          {
              String query = "select * from employee";
            
            // Exception handling 
             try
             {
                 Conn c=new Conn();
                 ResultSet rs = c.s.executeQuery(query);
                 table.setModel(DbUtils.resultSetToTableModel(rs));
             }
             catch(Exception ex)
             {
                 ex.printStackTrace();
             }
          }
          else
          {
            String query = "select * from employee where Emp_id = '"+cemployeeid.getSelectedItem()+"'";
            
            // Exception handling 
             try
             {
                 Conn c=new Conn();
                 ResultSet rs = c.s.executeQuery(query);
                 table.setModel(DbUtils.resultSetToTableModel(rs));
             }
             catch(Exception ex)
             {
                 ex.printStackTrace();
             }
          }
        }
           // Event For Print 
        else if(e.getSource().equals(print))
        {
            
             try
            {
                table.print();
            }catch(Exception exc)
            {
                   exc.printStackTrace();
            }
        }
         // Event For Update
         else if(e.getSource().equals(update))
        {
            setVisible(false);
            new UpdateEmployee(cemployeeid.getSelectedItem());
        }
          // Event For Back
     
       else 
        {
            setVisible(false);
            new Home();
        }
       // throw new UnsupportedOperationException("Not supported yet."); 
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    }
     
    

