package com.java.be;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/edit","/edit/*"})
public class editUserServlet extends HttpServlet {
	public void edit_service (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
res.setContentType("text/html");
		
		String fName = req.getParameter("firstName");
        String lName = req.getParameter("lastName");
        String DoB = req.getParameter("DoB");
        String PoB = req.getParameter("PoB");
        String Sex = req.getParameter("Sex");
        String[] freeDay = req.getParameterValues("freeDay");
        
        PrintWriter printWriter = res.getWriter();
        
        // Store data in User object
        User user = new User(fName,lName,DoB,PoB,Sex,freeDay);
		
        req.setAttribute("user", user);
        String url = "/edit.jsp";
        getServletContext().getRequestDispatcher(url).forward(req, res);
        
		printWriter.close();
	}
}
