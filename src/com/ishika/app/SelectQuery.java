package com.ishika.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {
   private static final String DM_URL="jdbc:mysql://localhost:3306/BOOK";
   private static final String DM_USERNAME="root";
   private static final String DM_USERPASSWORD="6267496475";
   private static final String DM_SELECT="SELECT * FROM STUDENT";// WHERE STUDENTID=102";
   public static void main(String[] args) throws Exception {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con= DriverManager.getConnection(DM_URL, DM_USERNAME, DM_USERPASSWORD);
	 Statement stm=con.createStatement();
     ResultSet rs=stm.executeQuery(DM_SELECT);
     while(rs.next())
     {
    	 System.out.print(rs.getInt("StudentId")+"          ");
    	 System.out.print(rs.getString("StudentName")+"         ");
    	 System.out.print(rs.getString("StudentEmail")+"        ");
    	 System.out.println(rs.getString("StudentAddress")+"       ");
    	 System.out.println("----------------------------------------------");
    	 
     }
    
    	 //System.out.println("NO RECord FOUND");
     con.close();
   }
}
