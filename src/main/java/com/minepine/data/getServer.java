package com.minepine.data;

import java.sql.*;

public class getServer 
{
	public getServer()
	{
		ResultSet attendence = getAttendence();
		try
		{
			while(attendence.next())
			{
				Person p = getPerson(attendence);
				String msg = Integer.toString(p.age);
				msg += ": " + p.name;
				msg += ": " + p.grade;
				System.out.println(msg);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	private static ResultSet getAttendence()
	{
		Connection con = null;
		try 
		{
			Statement s = con.createStatement();
			String select = "Select name, age, year";
			ResultSet rows;
			rows = s.executeQuery(select);
			return rows;
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return null;
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
	
	private static Person getPerson(ResultSet People)
	{
		try
		{
			String name = People.getString("Name");
			int age = People.getInt("Age");
			int grade = People.getInt("Grade");
			return new Person(name, age, grade);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	private static class Person
	{
		String name;
		int age;
		int grade;
		
		public Person(String name, int age, int grade)
		{
			this.name = name;
			this.age = age;
			this.grade = grade;
		}
	}
}

