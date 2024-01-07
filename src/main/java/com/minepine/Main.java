package com.minepine;

import java.sql.*;

import com.minepine.gui.*;

public class Main 
{	
	public static void main(String[] args)
	{
		loginPage login = new loginPage();
	}
	
	public static Connection getConnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://74.215.125:3306/Attendence_Tracker";
			String usr = "guest";
			String pwd = "";
			con = DriverManager.getConnection(url, usr, pwd);
		}
		catch (ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
			System.exit(0);
		}
		return con;
	}
}
