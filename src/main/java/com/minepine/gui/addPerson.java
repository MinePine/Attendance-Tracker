package com.minepine.gui;

import java.awt.event.*;
import javax.swing.*;

public class addPerson 
{
	JFrame mainFrame = new JFrame();
	JTextField name, age, grade;
	JButton submit;
	
	public addPerson()
	{
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("New Person");
		
		JPanel mainPanel = new JPanel();
		JPanel fieldPanel = new JPanel();
		
		Action a1 = new Action();
		
		submit = new JButton();
		submit.addActionListener(a1);
		
		name = new JTextField(30);
		
		age = new JTextField(2);
		
		grade = new JTextField(2);
		
		fieldPanel.add(name);
		fieldPanel.add(age);
		fieldPanel.add(grade);
				
		mainPanel.add(submit); 
		
		mainFrame.add(mainPanel);
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
	
	private class Action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == submit)
			{
				
			}
		}
	}
}
