package com.te.springrest.service;

import java.util.List;

import com.te.springrest.beans.EmployeeInfo;


public interface EmployeeService {

	
	
	public EmployeeInfo getEmployee(Integer id);

	public boolean delete(Integer id);
	
	public EmployeeInfo register(EmployeeInfo info);
	
	public boolean update(EmployeeInfo newData);
	
	public List<EmployeeInfo> getAllData();
}
