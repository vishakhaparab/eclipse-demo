package com.Regform;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Registrationform
 */
@WebServlet("/Registrationform")
public class Registrationform extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Registrationform() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private static Connection connection = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		connection = Dbconnection.getConnection();
		String firstname  =request.getParameter("name");
		String fathername  =request.getParameter("fname");
		String email = request.getParameter("email");
		String birthdate  = request.getParameter("bdate");
		String country  = request.getParameter("country");
		String countrycode  = request.getParameter("phone");
		String phoneno = request.getParameter("phoneno");
		String gender = request.getParameter("gender");
		String num1  = request.getParameter("num1");
		String num2  = request.getParameter("num2");
		String num3  = request.getParameter("num3");
		try{
		    Connection conn = Dbconnection.getConnection();
		    PreparedStatement ps = conn.prepareStatement("insert into form values(?,?,?,?,?,?,?,?,?,?,?)");
		    ps.setString(1, firstname);
		    ps.setString(2, fathername);
		    ps.setString(3, email);
		    ps.setString(4, birthdate);
		    ps.setString(5, country);
		    ps.setString(6, countrycode);
		    ps.setString(7, phoneno);
		    ps.setString(8, gender);
		    ps.setString(9, num1);
		    ps.setString(10, num2);
		    ps.setString(11, num3);
		    ps.executeUpdate();
		    ps.close();
		    response.sendRedirect(request.getContextPath() + "?msg=form send"); 
		}   
		catch (SQLException e)
		{
			e.printStackTrace();
			response.sendRedirect(request.getContextPath() + "?msg=form not send");
			
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
		response.sendRedirect(request.getContextPath() + "/Register.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
