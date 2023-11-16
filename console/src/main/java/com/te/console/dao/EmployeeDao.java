package com.te.console.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.te.console.beans.Employee;



public class EmployeeDao {

	String url = "jdbc:mysql://localhost:3306/console";
	
	String insertEmp = "insert into employee" + "(name,password,dateofbirth,email,salary,role) values"
						+ "(?,?,?,?,?,?);";
	
	String empById = "select * from employee where id = ?";
	
	String allEmp = "select * from employee";
	
	String deleteEmp = "delete from employee where id = ?";
	
	String updateEmp = "update employee set name = ?, password = ?, dateofbirth = ?, email = ?, salary = ?, role = ?";

	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void insertEmp(Employee emp) {
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(insertEmp);){
			preparedStatement.setString(1, emp.getName());
			preparedStatement.setString(2, emp.getPassword());
			//preparedStatement.setString(3, emp.getDateofbirth());
			preparedStatement.setString(3, emp.getEmail());
			preparedStatement.setDouble(4, emp.getSalary());
			preparedStatement.setString(5, emp.getRole());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean updateEmp(Employee emp) {
		boolean updateRow = false;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(updateEmp);){
			statement.setString(1, emp.getName());
			statement.setString(2, emp.getPassword());
			statement.setString(3, emp.getEmail());
			statement.setDouble(4, emp.getSalary());
			statement.setString(5, emp.getRole());
			
			updateRow = statement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return updateRow;
	}
	
	public Employee selectEmp(int id) {
		Employee emp = null;
		
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(empById);){
			preparedStatement.setInt(1, id);
			System.out.println(preparedStatement);
			ResultSet result = preparedStatement.executeQuery();
			
			while(result.next()) {
				String name = result.getString("name");
				String password = result.getString("password");
				String email = result.getString("email");
				double salary = result.getDouble("salary");
				String role = result.getString("role");
				
				emp = new Employee(id,name,password,email,salary,role);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
	
	public List<Employee> selectAllEmp() {
		List<Employee> emps = new ArrayList<Employee>();
		
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(allEmp);){
			
			System.out.println(preparedStatement);
			ResultSet result = preparedStatement.executeQuery();
			
			while(result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String password = result.getString("password");
				String email = result.getString("email");
				double salary = result.getDouble("salary");
				String role = result.getString("role");
				
				emps.add(new Employee(id,name,password,email,salary,role));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emps;
	}
	
	public boolean deleteEmp(int id) {
		boolean deleteRow = false;
		try (Connection connection = getConnection();
				PreparedStatement statement = connection.prepareStatement(deleteEmp);){
			statement.setInt(1, id);
			deleteRow = statement.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteRow;
	}
}
