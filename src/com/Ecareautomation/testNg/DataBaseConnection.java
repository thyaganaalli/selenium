package com.Ecareautomation.testNg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DataBaseConnection {
	public  Connection conn;
	public  Statement stat;
	public  ResultSet rs;
	public void dbconnection() throws ClassNotFoundException ,Exception {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
conn = DriverManager.getConnection(
		     "jdbc:sqlserver://THYAGA-PC;databasename=raju","SA","raju");
stat = conn.createStatement();
rs=stat.executeQuery("select *from emp ");
while(rs.next())
{
//	String str=rs.getString("enmae");
	System.out.println("Emp id is"+rs.getInt("enmae"));
}
	}

  @Test
  public void f() throws Exception {
	  dbconnection();
  }
  

}
