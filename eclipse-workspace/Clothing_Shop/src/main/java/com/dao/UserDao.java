package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.User;
import com.util.DbUtil;

public class UserDao {

	public static void RegisterUser(User u) {
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "insert into tbluser (fname,lname,email,address,password,mobile,usertype) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getAddress());
			pst.setString(5, u.getPassword());
			pst.setLong(6, u.getMobile());
			pst.setString(7, u.getUsertype());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean CheckEmail(String email) {
		boolean flag = false;
		
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "select * from tbluser where email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs =pst.executeQuery();
			
			if (rs.next()) {
				flag= true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public static User LoginUser(String email) {
		User u = null;
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "select * from tbluser where email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs =pst.executeQuery();
			if (rs.next()) {
				u= new User();
				u.setUid(rs.getInt("uid"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setMobile(rs.getLong("mobile"));
				u.setAddress(rs.getString("address"));
				u.setPassword(rs.getString("password"));
				u.setUsertype(rs.getString("usertype"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;
	}
	
	public static void ChangePassword(String email,String password) {
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "update tbluser set password= ? where email = ?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1,password);
			pst.setString(2, email);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void UpdateProfile(User u) {
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "update tbluser set fname=?,lname=?,mobile=?,address= ? where email = ?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setString(1,u.getFname());
			pst.setString(2, u.getLname());
			pst.setLong(3, u.getMobile());
			pst.setString(4, u.getAddress());
			pst.setString(5, u.getEmail());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
