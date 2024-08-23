package com.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.bean.User;
import com.dao.UserDao;
import com.util.UserUtil;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("insert")) {
			System.out.println("Insert");
			if (request.getParameter("password").equals(request.getParameter("c_pass"))) {
				System.out.println("Match");
				User u = new User();
				u.setFname(request.getParameter("fname"));
				u.setLname(request.getParameter("lname"));
				u.setEmail(request.getParameter("email"));
				u.setMobile(Long.parseLong(request.getParameter("mobile")));
				u.setPassword(request.getParameter("password"));
				UserDao.insertUser(u);
				request.setAttribute("msg", "Data Inserted Successfully.");
				request.getRequestDispatcher("show.jsp").forward(request, response);
			}
		}
			else if (action.equalsIgnoreCase("edit")) {
				int id = Integer.parseInt(request.getParameter("id"));
				User u = UserDao.getUser(id);
				request.setAttribute("u", u);
				request.getRequestDispatcher("update.jsp").forward(request, response);
				
			}
			
			else {
				System.out.println("else");
				request.setAttribute("msg", "Password and Confirm Password Doesn't Match!!!!");
				request.getRequestDispatcher("show.jsp").forward(request, response);
			}
		
	}

}
