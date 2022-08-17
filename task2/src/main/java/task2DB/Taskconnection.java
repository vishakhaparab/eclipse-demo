package task2DB;
import java.sql.*;

public class Taskconnection {
	static Connection con;
	static String url;
	 public static Connection getConnection(){
	    	try
	        {    		
	        	String url= "jdbc:mysql://localhost:3306/userforms?characterEncoding=utf8&autoReconnect=true&useUnicode=true";    		
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        	try
	        	{        		
	        		if(con!=null) {
		        		try {
		        
		        		}
		        		finally{
		        			con.close();
		        		}
	        		}        		
	        		con = DriverManager.getConnection(url,"root","sql@2022");
	        		System.out.println("Connection successful");
	        	    return con;        			
	        	}
	        	catch (SQLException ex)
	        	{
	        		ex.printStackTrace();
	        		System.out.println(ex);
	        	}
	        }
	        catch(ClassNotFoundException e)
	        {
	           System.out.println(e);
	        }
	    	return con;
	    }

}
