import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import task2DB.Taskconnection;


/**
 * Servlet implementation class TaskServlet
 */
public class TaskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private static Connection connection = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		connection = Taskconnection.getConnection();
	
		JSONObject J = new JSONObject();
		try 
		{	
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from task2");
			while(rs.next())
			{
				
			    try {
			    	J.put("productid", rs.getString("productid"));
			        J.put("product_tt", rs.getString("product_title"));
			        J.put("product_image", rs.getString("product_img"));
			        J.put("product_avail", rs.getString("product_availability"));
			        J.put("product_cost", rs.getString("product_prize"));
			        J.put("product_del", rs.getString("product_delcharge"));
			        J.put("product_description", rs.getString("product_desc"));
			        
	
			    } 
			    catch (JSONException e)
			    {
			    	System.out.println(e);
			    }
			
			
				}
			rs.close();
			statement.close();
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		response.getWriter().print(J.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
