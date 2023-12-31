package com.minepine.gui;

import java.awt.event.*;
import javax.swing.*;

public class mainGUI
{
	JFrame mainFrame;
	
	public mainGUI()
	{
		mainFrame = new JFrame();
		mainFrame.setSize(600, 600);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Attendence");
		
		JPanel mainPanel = new JPanel();
		Action a1 = new Action();
		
		mainFrame.setVisible(true);
	}
	
	private class Action implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
}
