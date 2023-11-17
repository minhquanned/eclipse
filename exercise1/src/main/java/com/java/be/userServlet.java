package com.java.be;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/userConfirm","/userConfirm/*"})
public class userServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        // Get data from index.jsp
        String fName = req.getParameter("firstName");
        String lName = req.getParameter("lastName");
        String DoB = req.getParameter("DoB");
        String PoB = req.getParameter("PoB");
        String Sex = req.getParameter("Sex");
        String[] freeDay = req.getParameterValues("freeDay");

        try {
            // Connect to database
            Connection c = dbConnect.initializeDatabase();

            // Execute query
            String sql = "insert into [USER] (firstName, lastName, doB, poB, sex) values (?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(sql);

            stm.setString(1, fName);
            stm.setString(2, lName);
            stm.setString(3, DoB);
            stm.setString(4, PoB);
            stm.setString(5, Sex);

            stm.executeUpdate();
            stm.close();
            c.close();

            String url = "/confirm.jsp";
            getServletContext().getRequestDispatcher(url).forward(req, res);

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}