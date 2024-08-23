package com.module_2;


class Memeber{
	String name,address;
	int age;
	String mobile;
	double salary;
	
	void print_salary() {
		System.out.println("Salary : "+salary);
	}
}

class Employee extends Memeber{
	String specialization;
	
	public Employee(String name,int age,String mobile,String address,double salary, String specialization) {
	this.name = name;
	this.age = age;
	this.address = address;
	this.mobile = mobile;
	this.salary = salary;
	this.specialization = specialization;
	}
}


class Manager extends Memeber{
	String department;
	
	public Manager(String name,int age,String mobile,String address,double salary,String department) {
	this.name = name;
	this.age = age;
	this.address = address;
	this.mobile = mobile;
	this.salary = salary;
	this.department = department;
	}
}



public class Employee_Manager {
	public static void main(String[] args) {
		Employee employee = new Employee("Nikhil", 21, "7016599807", "Ahmedabad", 150000,"Software Engineering");
		Manager manager =new Manager("Devam", 21, "6354968283", "Ahmedabad", 50000, "IT Department");
		
		System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.mobile);
        System.out.println("Address: " + employee.address);
        System.out.println("Specialization: " + employee.specialization);
        employee.print_salary();

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.mobile);
        System.out.println("Address: " + manager.address);
        System.out.println("Department: " + manager.department);
        manager.print_salary();
	}
}

