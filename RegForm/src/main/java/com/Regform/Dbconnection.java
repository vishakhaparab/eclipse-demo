package com.Regform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbconnection {
	static Connection con;
    static String url;
    public static Connection getConnection(){
    	try
        {    		
        	String url= "jdbc:mysql://localhost:3306/userforms?characterEncoding=utf8&autoReconnect=true&useUnicode=true";    		
        	Class.forName("com.mysql.jdbc.Driver");
        	try
        	{        		
        		if(con!=null) {
	        		try {
	        			
	        		}
	        		finally{
	        			con.close();
	        		}
        		}        		
        		con = DriverManager.getConnection(url,"root","python@22");
        	    return con;        			
        	}
        	catch (SQLException ex)
        	{
        		ex.printStackTrace();
        	}
        }
        catch(ClassNotFoundException e)
        {
           System.out.println(e);
        }
    	return con;
    }
}