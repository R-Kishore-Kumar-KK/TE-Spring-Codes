package com.te.springrest.dao;

import java.util.List;

import com.te.springrest.beans.EmployeeInfo;


public interface EmployeeDao {

	
	
	public EmployeeInfo getEmployee(Integer id);

	public boolean delete(Integer id);
	
	public boolean register(EmployeeInfo info);
	
	public boolean update(EmployeeInfo newData);

	public List<EmployeeInfo> getAllData();
}

