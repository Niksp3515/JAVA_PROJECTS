package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.bean.User;
import com.util.DbUtil;

public class ProductDao {

	public static void AddProduct(Product p) {
		Connection conn = DbUtil.Create_Conn();
		try {
			String sql = "insert into tblproduct (product_name,product_desc,product_price,product_category,product_image,uid) values (?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, p.getProduct_name());
			pst.setString(2, p.getProduct_desc());
			pst.setInt(3, p.getProduct_price());
			pst.setString(4, p.getProduct_category());
			pst.setString(5, p.getProduct_image());
			pst.setInt(6, p.getUid());
			pst.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void UpdateProduct(Product p) {
		Connection conn = DbUtil.Create_Conn();
		try {
			String sql = "update tblproduct set product_name=?,product_desc=?,product_price=?,product_category=?,product_image=? where pid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, p.getProduct_name());
			pst.setString(2, p.getProduct_desc());
			pst.setInt(3, p.getProduct_price());
			pst.setString(4, p.getProduct_category());
			pst.setString(5, p.getProduct_image());
			pst.setString(5, p.getProduct_image());
			pst.setInt(6, p.getPid());
			pst.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void DeleteProduct(int pid) {
		Connection conn = DbUtil.Create_Conn();
		try {
			String sql = "delete from tblproduct where pid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Product> getProductBySeller(int uid){
		List<Product> list = new ArrayList<Product>();
		
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "select * from tblproduct where uid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_desc(rs.getString("product_desc"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Product getProduct(int pid){
		Product p =null;
		
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "select * from tblproduct where pid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
				if (rs.next()) {
				p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setUid(rs.getInt("uid"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}
	
	public static List<Product> getAllProduct(){
		List<Product> list = new ArrayList<Product>();
		
		try {
			Connection conn = DbUtil.Create_Conn();
			String sql = "select * from tblproduct";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setProduct_category(rs.getString("product_category"));
				p.setProduct_name(rs.getString("product_name"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setProduct_image(rs.getString("product_image"));
				p.setProduct_desc(rs.getString("product_desc"));
				p.setUid(rs.getInt("uid"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
