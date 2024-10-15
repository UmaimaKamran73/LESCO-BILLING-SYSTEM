/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class EmployeeLogin extends JFrame
{
    JLabel jlUsername;
    JTextField tfUsername;
    JLabel jlPassword;
    JPasswordField pfPassword;
    JButton jbLogin;
    JLabel lbLogin;
    public EmployeeLogin() 
    {
        init();
        setVisible(true);
    }
    
    private void init() 
    {
        setBounds(100,100,500,500);
        setLayout(new BorderLayout());
        setTitle("Employee Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //label of login on north
        JPanel jpHeader=new JPanel(new FlowLayout(FlowLayout.CENTER));
        lbLogin=new JLabel("EMPLOYEE LOGIN");
        jpHeader.add(lbLogin,BorderLayout.CENTER);
       
        //center having grid
        JPanel jpCenter=new JPanel(new GridLayout(2,2,10,10));
       
        jlUsername=new JLabel("Username:");
        tfUsername=new JTextField();
        jlPassword=new JLabel("Password: ");
        pfPassword=new JPasswordField();
        
        jpCenter.add(jlUsername);
        jpCenter.add(tfUsername);
        jpCenter.add(jlPassword);
        jpCenter.add(pfPassword);
        
        
        //south having login button
        JPanel jpSouthBtn=new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        jbLogin=new JButton("LOGIN");
        
        jpSouthBtn.add(jbLogin);
        
        
        add(jpHeader,BorderLayout.NORTH);
        add(jpCenter,BorderLayout.CENTER);
        add(jpSouthBtn,BorderLayout.SOUTH);
        
        pack();
        setLocationRelativeTo(null);
    }
    
}
