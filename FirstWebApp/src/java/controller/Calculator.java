/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
@WebServlet(name = "Calculator", urlPatterns = {"/calc"})
public class Calculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            int num1 = Integer.parseInt(request.getParameter("value1"));
            int num2 = Integer.parseInt(request.getParameter("value2"));
            String ope = request.getParameter("operate");
            int res = 0;
            if(ope.equals("plus")){
                res = num1 + num2; 
            }
            else if(ope.equals("minus")){
                res = num1 - num2;
            }
            out.println(res);
        } catch (Exception e) {
            out.println("Please enter number");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
