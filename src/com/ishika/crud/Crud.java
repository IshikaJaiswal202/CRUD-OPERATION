package com.ishika.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Crud {
	private static final String DB_URL="jdbc:mysql://localhost:3306/crud";
	private static final String DB_USERNAME="root";
	private static final String DB_USERPASSWORD="6267496475";
	
 public static Connection getConnection() throws Exception
 {
	//final String DM_INSERT="INSERT INTO STUDENT Values()";
	Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con=DriverManager.getConnection(DB_URL, DB_USERNAME, DB_USERPASSWORD);
	 
	 return con;
 }
  public static void insertValue(int id, String name, int age, String address) throws Exception
  {
		final String DM_INSERT="INSERT INTO user Values('"+id+"','"+name+"','"+age+"','"+address+"')";
		Connection con=Crud.getConnection();
		Statement stm=con.createStatement();
		int count=stm.executeUpdate(DM_INSERT);
		if(count>0)
			System.out.println("Successfully INSERTED");
		else
			System.out.println("FailED To Add");
  }
  public static void deleteValue(int id)throws Exception
  {
		final String DM_DELETE="DELETE FROM user where id='"+id+"'";
		Connection con=Crud.getConnection();
		Statement stm=con.createStatement();
		int count=stm.executeUpdate(DM_DELETE);
		if(count>0)
			System.out.println("Successfully DELETED");
		else
			System.out.println("FailED To delete");
	  
  }
  public static void updateValue(int id,String name)throws Exception
  {
		final String DM_DELETE="UPDATE USER SET name='"+name+"' where id='"+id+"'";
		Connection con=Crud.getConnection();
		Statement stm=con.createStatement();
		int count=stm.executeUpdate(DM_DELETE);
		if(count>0)
			System.out.println("Successfully UPDATE");
		else
			System.out.println("FailED To UPDATE");
	  
  }
  public static void listValue()throws Exception
  {
	   final String DM_SELECT="SELECT * FROM USER";
		Connection con=Crud.getConnection();
		Statement stm=con.createStatement();
	     ResultSet rs=stm.executeQuery(DM_SELECT);
	     while(rs.next())
	     {
	    	 System.out.print(rs.getInt("id")+"          ");
	    	 System.out.print(rs.getString("name")+"         ");
	    	 System.out.print(rs.getString("age")+"        ");
	    	 System.out.println(rs.getString("address")+"       ");
	    	 System.out.println("----------------------------------------------");
	    	 
	     }
  }
}
