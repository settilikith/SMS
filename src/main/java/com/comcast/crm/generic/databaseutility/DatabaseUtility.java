package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection con;
	public void getDbconnection()
	{
		try
		{
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Hunk","root","root");
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	public void closeDbconnection()
	{
		try
		{
			con.close();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
	}
	public ResultSet executeSelectQuery(String query) 
	{
		ResultSet r =null;
		try
		{
			Statement stat =con.createStatement();
			r=stat.executeQuery(query);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return r;
		
	}
	public int executeNonselectQuery(String query)
	{
		int r=0;
		try
		{
			Statement stat =con.createStatement();
			r=stat.executeUpdate(query);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return r;
	}

}
