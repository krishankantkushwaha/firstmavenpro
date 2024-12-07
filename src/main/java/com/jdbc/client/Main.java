package com.jdbc.client;


import java.util.List;

import com.jdbc.dao.EmployeeDao;
import com.jdbc.dao.EmployeeDaoImpl;
import com.jdbc.entity.Employee;


public class Main {
      
	
	    public static void main(String[] args) {
//		 try {
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata","root","root");
//			Statement stmt = conn.createStatement();
//			stmt.executeUpdate( "insert into mytable(id,name,gender,salary) value(3,'raj','male',34000)" );
//			System.out.println("Transaction successfull");
// 		 } catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
	    	
	    	
	    	Employee emp =new Employee();
	    	EmployeeDao dao = new EmployeeDaoImpl();
//	    	dao.insertEmp(emp);
//	    	 emp =new Employee(5,32000,"anuradha","female");
//	    	 dao.insertEmp(emp);
//	    	 emp =new Employee(6,44000,"kaushalya","female");
//	    	 dao.insertEmp(emp);
//	    	 emp =new Employee(7,43200,"anushrish","male");
//	    	 dao.insertEmp(emp);
//	    	 emp =new Employee(8,33400,"krishka","female");
//	    	 dao.insertEmp(emp);
//	    	 emp =new Employee(9,32000,"rajat","male");
//	    	 dao.insertEmp(emp);
	    	
	    	
//	    	 emp =new Employee(10,31000,"rituraj","male");
//	    	 dao.insertEmpPs(emp);
	    	 
//	    	dao.updateEmp(emp);
	    	
//	    	dao.deleteEmp(7);
//	    	dao.getEmpById(4);
	    	
//	    	dao.getEmpByName("krishna");
	    	dao.getAllEmps();
    	
	    	
	    	
//	    	List<Employee> allEmpRecords =dao.getAllEmpRecords();
//	    	for(Employee em : allEmpRecords) {
//	    		System.out.println("Emp: "+em);
//	    	}
	    	

	}

}
