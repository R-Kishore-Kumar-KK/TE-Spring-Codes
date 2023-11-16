package com.te.console.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.te.console.beans.Employee;
import com.te.console.dao.EmployeeDao;

public class EmployeeServlet extends HttpServlet{

	public EmployeeDao employeeDao;
	
	public EmployeeServlet() {
		this.employeeDao = new EmployeeDao();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		this.doGet(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getServletPath();
		
		switch(action) {
		case "/new":
			showNew(req, resp);
			break;
		case "/insert":
			break;
		case "/delete":
			break;
		case "/edit":
			break;
		case "/update":
			break;
		default:
			break;
		}
	}
	
	private void showNew (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		RequestDispatcher dispatcher = req.getRequestDispatcher("userForm.jsp");
		dispatcher.forward(req, resp);
	}
	
	private void insertUser (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		double salary = req.getParameter("salary");
		String role =  req.getParameter("role");
		Employee newEmp = new Employee(name,password,email,salary,role);
		employeeDao.insertUser(newUser)
	}
}
