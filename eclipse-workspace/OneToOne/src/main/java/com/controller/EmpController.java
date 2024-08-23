package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.Employee;
import com.bean.EmployeePersonalInfo;
import com.dao.EmployeeDao;

public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("insert")) {
			EmployeePersonalInfo ep = new EmployeePersonalInfo();
			ep.setFname(request.getParameter("fname"));
			ep.setLname(request.getParameter("lname"));
			ep.setMobile(request.getParameter("mobile"));
			ep.setEmail(request.getParameter("email"));
			EmployeeDao.InsertEmployeePersonalInfo(ep);
			
			Employee e = new Employee();
			e.setJob(request.getParameter("job"));
			e.setDname(request.getParameter("dname"));
			e.setEinfo(ep);
			EmployeeDao.InsertEmployee(e);
			request.setAttribute("msg", "data Inserted");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
