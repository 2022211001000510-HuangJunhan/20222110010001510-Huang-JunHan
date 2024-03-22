package com.Huangjunhan.week3;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycleServlet extends HttpServlet{

    public LifeCycleServlet(){
        System.out.println("i am in constructor --> LifeCycleServlet()");
    }

    public void init(){
        System.out.println("i am in init()");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        System.out.println("i am in service() --> doGet() ");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{


    }

    @Override
    public void destroy(){
        System.out.println("i am in destroy()");
    }
}
