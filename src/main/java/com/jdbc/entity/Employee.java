package com.jdbc.entity;

public class Employee {
   private int id ,salary;
   private String name ,gender;
   
   
public Employee() {
	super();
	
}
public Employee(int id, int salary, String name, String gender) {
	super();
	this.id = id;
	this.salary = salary;
	this.name = name;
	this.gender = gender;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", gender=" + gender + "]";
}
   
}
