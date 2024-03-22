package com.Huangjunhan.week3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{


    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String birthDate = request.getParameter("birthDate");

        PrintWriter wrtier = response.getWriter();
        wrtier.println("<br>username:"+username);
        wrtier.println("<br>password:"+password);
        wrtier.println("<br>email:"+email);
        wrtier.println("<br>gender:"+gender);
        wrtier.println("<br>birthDate:"+birthDate);
        wrtier.close();
    }
}
