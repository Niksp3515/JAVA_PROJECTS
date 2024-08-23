package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import com.bean.User;
import com.dao.UserDao;
import com.services.Services;


public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		System.out.println(action);
		
		if (action.equalsIgnoreCase("sign up")) {
			boolean flag = UserDao.CheckEmail(request.getParameter("email"));
			if (flag == false) {
				
				if (request.getParameter("password").equals(request.getParameter("cpassword"))) {
					User u = new User();
					u.setFname(request.getParameter("fname"));
					u.setLname(request.getParameter("lname"));
					u.setEmail(request.getParameter("email"));
					u.setBirthday(request.getParameter("birthday"));
					u.setPassword(request.getParameter("password"));
					u.setGender(request.getParameter("gender"));
					u.setPhone(Long.parseLong(request.getParameter("phone")));
					UserDao.SignUp(u);
					request.setAttribute("msg", "User Signup Successfully");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password and Confirm Password Doen't Matched!!!");
					request.getRequestDispatcher("index.jsp").forward(request, response);
				}

			}
			else {
				request.setAttribute("msg", "Email is Already Registered!!!!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
			
		}
		
		else if (action.equalsIgnoreCase("login")) {
			User u = UserDao.Login(request.getParameter("email"));
			
			if (u != null) {
				if (u.getPassword().equals(request.getParameter("password"))) {
					HttpSession session = request.getSession();
					session.setAttribute("u", u);
					response.sendRedirect("home.jsp");
				}
				else {
					request.setAttribute("msg", "Incorrect Password!!!!");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Email is Note Registered!!!");
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("change password")) {
			HttpSession session = request.getSession();
			User u = (User)session.getAttribute("u");
			
			if (u.getPassword().equals(request.getParameter("old_password"))) {
				if (request.getParameter("new_password").equals(request.getParameter("cnew_password"))) {
					UserDao.changePassword(u.getEmail(), request.getParameter("new_password"));
					response.sendRedirect("logout.jsp");
				}
				else {
					request.setAttribute("msg", "New Password And Confirm Password Doesn't Matched!!!!");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old Password Doesn't Matched!!!s");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("send otp")) {
		    boolean flag = UserDao.CheckEmail(request.getParameter("email"));
		    
		    if (flag) {
		        Random t = new Random();
		        int minRange = 1000, maxRange = 9999;
		        int otp = t.nextInt(maxRange - minRange) + minRange;
		        Services.sendMail(request.getParameter("email"), otp);
		        
		        HttpSession session = request.getSession();
		        session.setAttribute("otp1", otp);
		        session.setAttribute("email", request.getParameter("email"));
		        session.setAttribute("otpTime", System.currentTimeMillis());
		        
		        request.getRequestDispatcher("otp.jsp").forward(request, response);
		    } else {
		        request.setAttribute("msg", "Email is Not Registered.");
		        request.getRequestDispatcher("forgot-password.jsp").forward(request, response);
		    }
		    
		} else if (action.equalsIgnoreCase("verify otp")) {
		    HttpSession session = request.getSession();
		    int otp1 = (int) session.getAttribute("otp1");
		    int otp2 = Integer.parseInt(request.getParameter("otp2"));
		    long otpTime = (long) session.getAttribute("otpTime");
		    long currentTime = System.currentTimeMillis();
		    
		    if ((currentTime - otpTime) > 30000) {
		        request.setAttribute("msg", "OTP has expired. Please request a new one.");
		        request.getRequestDispatcher("otp.jsp").forward(request, response);
		    } else {
		        if (otp1 == otp2) {
		            response.sendRedirect("new-password.jsp");
		        } else {
		            request.setAttribute("msg", "Invalid OTP");
		            request.getRequestDispatcher("otp.jsp").forward(request, response);
		        }
		    }
		}
		
		else if (action.equalsIgnoreCase("update password")) {
			
			if (request.getParameter("new_password").equals(request.getParameter("cnew_password"))) {
				HttpSession session = request.getSession();
				UserDao.changePassword(session.getAttribute("email").toString(), request.getParameter("new_password"));
				session.removeAttribute("email");
				session.removeAttribute("otp");
				session.invalidate();
				request.setAttribute("msg", "Password Updated Successfully.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			else {
				request.setAttribute("msg","New Password and Confirm Password doesn't matched.");
				request.getRequestDispatcher("new-password.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("update profile")) {
			User u = new User();
			u.setUid(Integer.parseInt(request.getParameter("uid")));
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setBirthday(request.getParameter("birthday"));
			u.setGender(request.getParameter("gender"));
			u.setPhone(Long.parseLong(request.getParameter("phone")));
			UserDao.UpdateUser(u);
			HttpSession session= request.getSession();
			session.setAttribute("u", u);
			request.setAttribute("msg", "Update Profile Successfully");
			request.getRequestDispatcher("profile.jsp").forward(request, response);
		}
		else if (action.equalsIgnoreCase("re-generate otp")) {
			  Random t = new Random();
		        int minRange = 1000, maxRange = 9999;
		        int otp = t.nextInt(maxRange - minRange) + minRange;		        
		        HttpSession session = request.getSession();
		        Services.sendMail(session.getAttribute("email").toString(), otp);
		        session.setAttribute("otp1", otp);
		        session.setAttribute("otpTime", System.currentTimeMillis());
		        
		        request.getRequestDispatcher("otp.jsp").forward(request, response);
		}
		
	}

}
