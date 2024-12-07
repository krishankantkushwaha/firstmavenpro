package com.jdbc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.jdbc.entity.Employee;
import com.mysql.cj.jdbc.Driver;

public class EmployeeDaoImpl implements EmployeeDao {
	 
	static Connection conn;
	static {
		try {
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			
			
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
			
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata",prop);
			
			Driver d = new Driver();
			conn = d.connect("jdbc:mysql://localhost:3306/mydata",prop);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void insertEmp(Employee e) {
		try {
			Statement stmt = conn.createStatement();
			stmt.executeUpdate( "insert into mytable(id,salary,name,gender) value("+e.getId()+","+e.getSalary()+",'"+e.getName()+"','"+e.getGender()+"')" );
			System.out.println("Transaction successfull");
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmp(Employee e) {
		//try with resourse  .... stmt close na likhna pade is liye use kiya 
		try(Statement stmt = conn.createStatement();) {
		stmt.executeUpdate("update mytable set  name='" + e.getName() + "', salary=" + e.getSalary() + " where id ="+e.getId());
		System.out.println("update successfull");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
	}

	@Override
	public void deleteEmp(int id) {
		try(Statement stmt = conn.createStatement();) {
			stmt.executeUpdate("delete from mytable where id ="+id);
			System.out.println("Record Delete successfull");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		
	}

	@Override
	public void getEmpById(int id) {
		
		
	}

	@Override
	public void getAllEmps() {
		try {
			Statement stmt = conn.createStatement();
	
			ResultSet rs=	stmt.executeQuery("select*from mytable");
		while(rs.next()){
			System.out.println("Id="+rs.getInt(1)+" Name="+rs.getString(2)+" Gender="+rs.getString(3)+" Salary="+rs.getInt(4));
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
 
	
}
