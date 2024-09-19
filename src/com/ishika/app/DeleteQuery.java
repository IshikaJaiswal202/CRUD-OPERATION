package com.ishika.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteQuery
{
	// delete the data
	private static final String DM_URL="jdbc:mysql://localhost:3306/BOOK";
	private static final String DM_USERNAME="root";
	private static final String DM_USERPASSWORD="6267496475";
	private static final String DM_DELETE="DELETE FROM STUDENT Where STUDENTID=102";
	public static void main(String[] args)throws Exception
	{
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(DM_URL, DM_USERNAME, DM_USERPASSWORD);
	    Statement stm=con.createStatement();
	   int count=stm.executeUpdate(DM_DELETE);
	   System.out.println(count);
	    if(count>0)
	    {
	    	System.out.println("SuccessFully DELETED");
	    }
	}
}

