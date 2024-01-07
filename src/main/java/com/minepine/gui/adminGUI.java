package com.minepine.gui;

import java.awt.event.*;
import javax.swing.*;

public class adminGUI
{
	JFrame mainFrame = new JFrame();
	JButton addPerson;
	
	public adminGUI()
	{
		mainFrame.setSize(600, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Attendence");
		
		JPanel mainPanel = new JPanel();
		Action a1 = new Action();
		
		addPerson = new JButton("Add Student");
		addPerson.addActionListener(a1);
		
		mainPanel.add(addPerson);
		
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}
	
	private class Action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == addPerson)
			{
				addPerson p1 = new addPerson();
			}
		}
	}
}
