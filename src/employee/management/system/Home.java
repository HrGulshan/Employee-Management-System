
package employee.management.system;
/**
 *
 * @author Gulshan kumar 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener
{
    JButton add,view,update,remove;
    Home()
    {
        setLayout(null);
        
         // Home image //
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);
        
        // label 
        JLabel heading =  new JLabel("Employee Management System");
        heading.setBounds(650,20,400,40);
        heading.setFont(new Font("TAHOMA",Font.BOLD,25));
        image.add(heading);
        
        // Button add Employee
        add  = new JButton("Add Employee");
        add.setBounds(650,80,150,40);
        add.addActionListener(this);
        image.add(add);
        
        // Button view  Employee
        view  = new JButton("View Employee's");
        view.setBounds(820,80,150,40);
        view.addActionListener(this);
        image.add(view);
        
        // Button Update Employee
        update = new JButton("Update Employee");
        update.setBounds(650,140,150,40);
        update.addActionListener(this);
        image.add(update);
        
        // Button remove Employee
        remove  = new JButton("Remove Employee");
        remove.setBounds(820,140,150,40);
        remove.addActionListener(this);
        image.add(remove);
        
        // Frame size
        setSize(1150,630);
        setLocation(250,100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        // Event for add 
        if (ae.getSource() == add)
        {
            setVisible(false);
            new AddEmployee();
        }
        // Event for view
        else if (ae.getSource() == view)
        {
            setVisible(false);
            new ViewEmployee();
        }
        // Event for update
        else if (ae.getSource() == update )
        {
            setVisible(false);
            new ViewEmployee();
        }
        else
        {
            setVisible(false);
            new RemoveEmployee();
        }
        
    }
    
    public static void main(String[] args)
    {
        new Home();
    }
    
    
}
