package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.WishList;
import com.util.DbUtil;

public class WishListDao {

	public static void AddToWishList(WishList w) {
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "insert into tblwishlist (uid,pid) values (?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getUid());
			pst.setInt(2, w.getPid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void RemoveFromWishList(int uid,int pid) {
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "delete from tblwishlist where uid =? and pid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2,pid);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<WishList> getWishListByUser(int uid){
		List<WishList> list = new ArrayList<WishList>();
		
			try {
				Connection conn = DbUtil.Create_Conn();
				String sql = "select * from tblwishlist where uid = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, uid);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					WishList w= new WishList();
					w.setPid(rs.getInt("pid"));
					w.setUid(rs.getInt("uid"));
					w.setWid(rs.getInt("wid"));
					list.add(w);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return list;
	}
	
	public static boolean CheckWhishList(int uid,int pid) {
		boolean flag = false;

		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "select * from tblwishlist where uid = ? and pid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
}
