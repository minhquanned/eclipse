package com.java.be;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

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
        
        User user = new User(fName,lName,DoB,PoB,Sex,freeDay);

        try {
            // Connect to database
            Connection c = dbConnect.initializeDatabase();

            // insert new User
            String sql = "insert into [USER] (firstName, lastName, doB, poB, sex)  values (?, ?, ?, ?, ?)";
            PreparedStatement pstm = c.prepareStatement(sql);
            Statement stm = c.createStatement();

            pstm.setString(1, fName);
            pstm.setString(2, lName);
            pstm.setString(3, DoB);
            pstm.setString(4, PoB);
            pstm.setString(5, Sex);

            pstm.executeUpdate();    
            
            // Get idUser after insert
            ResultSet rs = stm.executeQuery("select top 1 idUser from [USER] order by idUser desc");
            int idUser = 0;
            while(rs.next()) {
            	idUser = rs.getInt("idUser");
            }
            System.out.println(idUser);
            
            pstm.close();
            c.close();
            
            HttpSession session = req.getSession();
            session.setAttribute("user", user);
            session.setAttribute("idUser", idUser);
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