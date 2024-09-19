package com.ishika.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentInsert 
{
     private static final String DM_URl="jdbc:mysql://localhost:3306/BOOK";
     private static final String DM_USERNAME="root";
     private static final String DM_USERPASSWORD="6267496475";
     private static final String DM_INSERT="INSERT INTO STUDENT values(104,'Chhaya jaiswal','Chhaya@29','Lunhera')";
     public static void main(String[] args)throws Exception
     {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(DM_URl, DM_USERNAME, DM_USERPASSWORD);
		Statement st=con.createStatement();
		int count=st.executeUpdate(DM_INSERT);
		if(count>0)
		System.out.println("SuccessFully Inserted");
	 }
}
