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
import javax.swing.JTextField;

/**
 *
 * @author LENOVO
 */
public class CusomterLogin extends JFrame
{
    JLabel jlCustID;
    JTextField tfCustID;
    JLabel jlCNIC;
    JTextField tfCNIC;
    JButton jbLogin;
    JLabel lbLogin;
    public CusomterLogin() 
    {
        init();
        setVisible(true);
    }

    private void init() 
    {
        setBounds(100,100,500,500);
        setLayout(new BorderLayout());
        setTitle("Customer Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //label of login on north
        JPanel jpHeader=new JPanel(new FlowLayout(FlowLayout.CENTER));
        lbLogin=new JLabel("CUSTOMER LOGIN");
        jpHeader.add(lbLogin,BorderLayout.CENTER);
       
        //center having grid
        JPanel jpCenter=new JPanel(new GridLayout(2,2,10,10));
       
        jlCustID=new JLabel("Customer ID:");
        tfCustID=new JTextField();
        jlCNIC=new JLabel("CNIC: ");
        tfCNIC=new JTextField();
        
        jpCenter.add(jlCustID);
        jpCenter.add(tfCustID);
        jpCenter.add(jlCNIC);
        jpCenter.add(tfCNIC);
        
        
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
