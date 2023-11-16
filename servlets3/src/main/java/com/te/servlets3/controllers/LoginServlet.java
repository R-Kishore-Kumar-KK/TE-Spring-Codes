package com.te.servlets3.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.servlets3.dao.LoginDao;

@WebServlet("/first")

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int a = 5;

		String user = request.getParameter("username");
		String pwd = request.getParameter("userpass");

		if (LoginDao.validate(user, pwd) == true) {
			RequestDispatcher rd = request.getRequestDispatcher("success1.jsp");
			rd.forward(request, response);
		} else {
			
			response.sendRedirect("./failedLogin.jsp");
		}

		out.close();
	}
}
