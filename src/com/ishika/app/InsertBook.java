package com.ishika.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertBook
{
   private static final String DM_URL="jdbc:mysql://localhost:3306/BOOk";
   private static final String DM_USERNAME="root";
   private static final String DM_USERPASSWORD="6267496475";
   private static final String DM_INSERT="INSERT INTO STUDENT values(103,'Soniya','Soniya@20','Dhamnod')";
   public static void main(String[] args) throws ClassNotFoundException, SQLException 
   {
	   //step=1  load Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	   //step=2 Get Connection
	Connection con=DriverManager.getConnection(DM_URL, DM_USERNAME, DM_USERPASSWORD);
	   //step=3 Create Statement
	Statement st=con.createStatement();
	   //step=4 execute Query
	 int count=st.executeUpdate(DM_INSERT);
	 //	   //step=5 process the Result

	 if(count>0)
	 {
		 System.out.println("Inserted Count : "+count);
	 }
	   //step=2  Close Connection
       con.close();
   }
}
