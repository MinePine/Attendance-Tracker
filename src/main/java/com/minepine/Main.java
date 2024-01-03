package com.minepine;

import java.sql.*;

public class Main 
{
	public static void main(String[] args)
	{
		getConnection();
	}
	
	public static Connection getConnection()
	{
		Connection con = null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://74.215.125:3306/Attendence_Tracker";
			String usr = "minepine";
			String pwd = "B3ng41s23";
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
