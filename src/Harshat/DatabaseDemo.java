package Harshat;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseDemo {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@CHNSIPDTOT:1521:XE","system","pass");
		    Statement st=cn.createStatement();
		    ResultSet r=st.executeQuery("select empname from emp where emp=7369");
		      while(r.next())
		      {
		    	  System.out.println(r.getInt(1));
		      }
		    
		}
		catch(Exception e)
		{
	         e.printStackTrace();
		}

	}

}
