package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.bean.EmployeePersonalInfo;
import com.util.EmpUtil;

public class EmployeeDao {

	public static void InsertEmployeePersonalInfo(EmployeePersonalInfo e) {
		Session session = EmpUtil.create_session();
		Transaction tr = session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
	}
	public static void InsertEmployee(Employee e) {
		Session session = EmpUtil.create_session();
		Transaction tr = session.beginTransaction();
		session.save(e);
		tr.commit();
	}
}
