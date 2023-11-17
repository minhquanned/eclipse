package com.java.be;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/userConfirm","/userConfirm/*"})
public class userServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String fName = req.getParameter("firstName");
        String lName = req.getParameter("lastName");
        String DoB = req.getParameter("DoB");
        String PoB = req.getParameter("PoB");
        String Sex = req.getParameter("Sex");
        String[] freeDay = req.getParameterValues("freeDay");
        
        try {
			Connection con = dbConnect.initializeDatabase();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        PrintWriter printWriter = res.getWriter();
        
        // Store data in User object
        User user = new User(fName,lName,DoB,PoB,Sex,freeDay);
		
        req.setAttribute("user", user);
        String url = "/confirm.jsp";
        getServletContext().getRequestDispatcher(url).forward(req, res);
        
		printWriter.close();
	}
}
