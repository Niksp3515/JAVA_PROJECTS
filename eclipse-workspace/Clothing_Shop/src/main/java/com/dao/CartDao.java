package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.bean.WishList;
import com.util.DbUtil;

public class CartDao {

	public static void AddToCart(Cart c) {
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "insert into tblcart (uid,pid,product_price,product_qty,total_price) values (?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getUid());
			pst.setInt(2, c.getPid());
			pst.setInt(3,c.getProduct_price());
			pst.setInt(4, c.getProduct_qty());
			pst.setInt(5, c.getTotal_price());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void RemoveFromCart(int uid,int pid) {

		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "delete from tblcart where uid =? and pid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2,pid);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Cart> getCartByUser(int uid){
		boolean payment_status = false;
		List<Cart> list = new ArrayList<Cart>();
		
			try {
				Connection conn = DbUtil.Create_Conn();
				String sql = "select * from tblcart where uid = ? and payment_status = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, uid);
				pst.setBoolean(2, payment_status);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					Cart c= new Cart();
					c.setPid(rs.getInt("pid"));
					c.setUid(rs.getInt("uid"));
					c.setCid(rs.getInt("cid"));
					c.setProduct_price(rs.getInt("product_price"));
					c.setProduct_qty(rs.getInt("product_qty"));
					c.setTotal_price(rs.getInt("total_price"));
					c.setPayment_status(rs.getBoolean("payment_status"));
					list.add(c);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return list;
	}
	
	public static List<Cart> getOrders(int uid){
		boolean payment_status = true;
		List<Cart> list = new ArrayList<Cart>();
		
			try {
				Connection conn = DbUtil.Create_Conn();
				String sql = "select * from tblcart where uid = ? and payment_status = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, uid);
				pst.setBoolean(2, payment_status);
				ResultSet rs = pst.executeQuery();
				while (rs.next()) {
					Cart c= new Cart();
					c.setPid(rs.getInt("pid"));
					c.setUid(rs.getInt("uid"));
					c.setCid(rs.getInt("cid"));
					c.setProduct_price(rs.getInt("product_price"));
					c.setProduct_qty(rs.getInt("product_qty"));
					c.setTotal_price(rs.getInt("total_price"));
					c.setPayment_status(rs.getBoolean("payment_status"));
					list.add(c);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return list;
	}
	
	public static boolean CheckCart(int uid,int pid) {
		boolean flag = false;
		boolean payment_status =false;
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "select * from tblcart where uid = ? and pid = ? and payment_status = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			pst.setBoolean(3, payment_status);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public static Cart getCart(int cid){
		Cart c = null;
		
			try {
				Connection conn = DbUtil.Create_Conn();
				String sql = "select * from tblcart where cid = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, cid);
				ResultSet rs = pst.executeQuery();
				if (rs.next()) {
					c= new Cart();
					c.setPid(rs.getInt("pid"));
					c.setUid(rs.getInt("uid"));
					c.setCid(rs.getInt("cid"));
					c.setProduct_price(rs.getInt("product_price"));
					c.setProduct_qty(rs.getInt("product_qty"));
					c.setTotal_price(rs.getInt("total_price"));
					c.setPayment_status(rs.getBoolean("payment_status"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return c;
	}
	
	public static void UpdateCart(Cart c) {
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "update tblcart set product_qty=?,total_price = ? where cid =? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1,c.getProduct_qty() );
			pst.setInt(2,c.getTotal_price());
			pst.setInt(3, c.getCid());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void UpdatePaymentStatus(int cid) {
		boolean payment_status = true;
		
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "update tblcart set payment_status=? where cid =? ";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setBoolean(1, payment_status);
			pst.setInt(2,cid );
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
