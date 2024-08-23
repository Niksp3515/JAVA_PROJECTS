package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import com.bean.Cart;
import com.bean.User;
import com.bean.WishList;
import com.dao.CartDao;
import com.dao.UserDao;
import com.dao.WishListDao;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("register")) {
			boolean flag = UserDao.CheckEmail(request.getParameter("email"));
			if (flag == false) {
				if (request.getParameter("password").equals(request.getParameter("cpassword"))) {
					User u = new User();
					u.setUsertype(request.getParameter("usertype"));
					u.setFname(request.getParameter("fname"));
					u.setLname(request.getParameter("lname"));
					u.setEmail(request.getParameter("email"));
					u.setAddress(request.getParameter("address"));
					u.setPassword(request.getParameter("password"));
					u.setMobile(Long.parseLong(request.getParameter("mobile")));
					UserDao.RegisterUser(u);
					request.setAttribute("msg", "User Registered Successfully🤘🤘🤘🤘🤘");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password & Confirm Password Doesn't Matched🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Email is Already Registered.");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("login")) {
			User u = UserDao.LoginUser(request.getParameter("email"));
			if (u != null) {
				if(u.getPassword().equals(request.getParameter("password")))
				{
					List<WishList> list = WishListDao.getWishListByUser(u.getUid());
					List<Cart> list1  = CartDao.getCartByUser(u.getUid());
					HttpSession session = request.getSession();
					session.setAttribute("u",u);
					session.setAttribute("wishlist_count", list.size());
					session.setAttribute("cart_count", list1.size());
					if (u.getUsertype().equals("buyer")) {
						request.getRequestDispatcher("index.jsp").forward(request, response);		
					}
					else {
						request.getRequestDispatcher("seller-index.jsp").forward(request, response);
					}
				
			}
				else {
					request.setAttribute("msg", "Incorrect Password😫😫😫😫😫");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				
			}
			else {
				request.setAttribute("msg", "Email is Not Registered!!😫😫😫😫😫");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("change password")) {
			HttpSession session = request.getSession();
			User u = (User)session.getAttribute("u");
			if (u.getPassword().equals(request.getParameter("old_password"))) {
				if (request.getParameter("new_password").equals(request.getParameter("cnew_password"))) {
					if (!u.getPassword().equals(request.getParameter("new_password"))) {
						UserDao.ChangePassword(u.getEmail(), request.getParameter("new_password"));
						response.sendRedirect("logout.jsp");
					}
				else {
					request.setAttribute("msg", "Old Password & New Password can not be Same!!!🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
					
				}
				else {
					request.setAttribute("msg", "New Password & Confirm new Password Doesn't Matched🤦‍♂️🤦‍♂️🤦‍♂️🤦‍♂️");
					request.getRequestDispatcher("change-password.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg", "Old Password Doesn't Matched!😫😫😫😫😫");
				request.getRequestDispatcher("change-password.jsp").forward(request, response);
			}
		}
		
		else if (action.equalsIgnoreCase("send otp")) {
			try
			{
//			String sendId="FSTSMS";
			String language="english";
			String route="p";
			String message = "Hello Friend";
			String apiKey ="DwF5Auzh16qo3fXC2JMSTcOiyBEZmWH0eR8GIg4NbQrpUnKsjvhz0YwyOCGvHJEFuXRrTc7feDVaM1NA"; 
			String number = "7016599807";
			message=URLEncoder.encode(message,"UTF-8");    //Important Step
			
			String myUrl="https://www.fast2sms.com/dev/bulkauthorization="+apiKey+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;

			URL url=new URL(myUrl);
			HttpsURLConnection con= (HttpsURLConnection)url.openConnection();
			
			con.setRequestMethod("GET");
			
			con.setRequestProperty("User-Agent","Mozilla/5.0");
			con.setRequestProperty("cache-control", "no-cache");
			
			int responseCode=  con.getResponseCode();
			System.out.println(responseCode);
			
			StringBuffer res=new StringBuffer();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			while(true)
			{
				String line=br.readLine();
				
				if(line==null)
				{
					break;
				}
				
				res.append(line);
			}
			
			System.out.println(res);
			
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if (action.equalsIgnoreCase("update profile")) {
			HttpSession session = request.getSession();
			User u =(User)session.getAttribute("u");
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setAddress(request.getParameter("address"));
			UserDao.UpdateProfile(u);
			session.setAttribute("u",u);
			response.sendRedirect("profile.jsp");
		}
	}

}
