package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Employee;
import com.bean.EmployeePersonalInfo;

public class EmpUtil {

	public static Session create_session() {
		SessionFactory sf = new Configuration().addAnnotatedClass(EmployeePersonalInfo.class)
				.addAnnotatedClass(Employee.class)
				.configure()
				.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}
