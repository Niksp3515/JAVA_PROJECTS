package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bean.Student;
import util.StudentUtil;

public class StudentDao {

	public static void insert(Student s) {
		try {
			Connection conn = StudentUtil.create_conn();
			String sql = "insert into student (fname,lname,email,mobile) values (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
