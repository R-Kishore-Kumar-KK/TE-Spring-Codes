package com.te.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ems.beans.EmployeeInfo;
import com.te.ems.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;

	@Override
	public EmployeeInfo authenticate(Integer id, String password) {
		if(id <= 0) {
		return null;
		}
		return dao.authenticate(id, password);
	}

	@Override
	public EmployeeInfo getEmployee(Integer id) {
		if(id <= 0) {
		return null;
		}
		return dao.getEmployee(id);
	}

	@Override
	public boolean delete(Integer id) {
		if(id <= 0) {
		return false;
		}
		return dao.delete(id);
	}

	@Override
	public boolean register(EmployeeInfo info) {
		
		return dao.register(info);
	}
	
	@Override
	public boolean update(EmployeeInfo newData) {
		
		return dao.update(newData);
	}

	@Override
	public List<EmployeeInfo> getAll(EmployeeInfo info) {
		
		return dao.getAll(info);
	}
}
