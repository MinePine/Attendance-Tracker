package com.minepine.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class loginPage 
{
	JButton login, reset, createAccount;
	JTextField username, password;
	JFrame mainFrame = new JFrame();
	
	public loginPage()
	{
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Login");
		mainFrame.setLayout(new GridLayout(3, 3, 3, 3));
		mainFrame.setResizable(false);
		
		JPanel userPanel = new JPanel();
		JPanel pwdPanel = new JPanel();
		JPanel submitPanel = new JPanel();
		
		Action a1 = new Action();
		
		JLabel usrname = new JLabel("Username: ");
		usrname.setHorizontalAlignment(JLabel.LEFT);
		
		username = new JTextField();
		username.setPreferredSize(new Dimension(250, 40));
		username.setText("Username");
		
		JLabel passwrd = new JLabel("Password: ");
		passwrd.setHorizontalAlignment(JLabel.LEFT);
		
		password = new JTextField();
		password.setPreferredSize(new Dimension(250, 40));
		password.setText("Password");
		
		login = new JButton("Login");
		login.addActionListener(a1);
		
		reset = new JButton("Reset");
		reset.addActionListener(a1);
		
		userPanel.add(usrname);
		userPanel.add(username);
		
		pwdPanel.add(passwrd);
		pwdPanel.add(password);
		
		submitPanel.add(login);
		submitPanel.add(reset);
		
		mainFrame.add(userPanel);
		mainFrame.add(pwdPanel);
		mainFrame.add(submitPanel);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	private class Action implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == login)
			{
				
			}
			
			if(e.getSource() == reset)
			{
				username.setText("Username");
				password.setText("Password");
			}
		}
	}
}
