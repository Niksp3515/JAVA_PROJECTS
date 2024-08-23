package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.User;
import com.util.UserUtil;

public class UserDao {

	public static void SignUp(User u) {
		
		try {
			Connection conn = UserUtil.create_conn();
			String sql = "insert into user(fname,lname,email,phone,birthday,gender,password) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());		
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getPhone());
			pst.setString(5, u.getBirthday());
			pst.setString(6, u.getGender());
			pst.setString(7, u.getPassword());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
public static void UpdateUser(User u) {
		
		try {
			Connection conn = UserUtil.create_conn();
			String sql = "update user set fname=?,lname=?,email=?,phone=?,birthday=?,gender=? where uid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());		
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getPhone());
			pst.setString(5, u.getBirthday());
			pst.setString(6, u.getGender());
			pst.setInt(7, u.getUid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean CheckEmail(String email) {
		boolean flag = false;
		
			try {
				Connection conn = UserUtil.create_conn();
				String sql = "select * from user where email = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, email);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					flag= true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return flag;
	}
	
	public static User Login(String email) {
		User u = null;
		
			try {
				Connection conn = UserUtil.create_conn();
				String sql = "select * from user where email = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, email);
				ResultSet rs= pst.executeQuery();
				
				if (rs.next()) {
					u = new User();
					u.setUid(rs.getInt("uid"));
					u.setFname(rs.getString("fname"));
					u.setLname(rs.getString("lname"));
					u.setEmail(rs.getString("email"));
					u.setBirthday(rs.getString("birthday"));
					u.setGender(rs.getString("gender"));
					u.setPhone(rs.getLong("phone"));
					u.setPassword(rs.getString("password"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return u;
	}
	
	public static void changePassword(String email,String password) {
		try {
			Connection conn = UserUtil.create_conn();
			String sql = "update user set password = ? where email = ? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, password);
			pst.setString(2, email);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
