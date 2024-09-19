package com.ishika.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateQuery 
{
           private static final String DM_URL="jdbc:mysql://localhost:3306/BOOK";
		   private static final String DM_USERNAME="root"; 
		   private static final String DM_USERPASSWORD="6267496475";
		   private static final String DM_UPDATE="UPDATE STUDENT set studentName='ishika' where studentID=103";
		   public static void main(String[] args)throws Exception
		   {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection con=DriverManager.getConnection(DM_URL, DM_USERNAME, DM_USERPASSWORD);
			 Statement stm=con.createStatement();
			 int count=stm.executeUpdate(DM_UPDATE);
			 if(count>0)
			 {
				 System.out.println(count);
			 }
		   }
}
