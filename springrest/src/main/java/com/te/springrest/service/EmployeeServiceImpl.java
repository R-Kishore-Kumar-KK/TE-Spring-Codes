package com.te.springrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.springrest.beans.EmployeeInfo;
import com.te.springrest.customexception.EmployeeException;
import com.te.springrest.dao.EmployeeDao;


@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao dao;

	

	@Override
	public EmployeeInfo getEmployee(Integer id) {
		if(id <= 0) {
			throw new EmployeeException("Dat Not found");
		}
		
		EmployeeInfo employeeInfo = dao.getEmployee(id);
		if(employeeInfo != null) {
			employeeInfo.setPwd(null);
			return employeeInfo;
		} else {
			throw new EmployeeException("Data Not found");
		}
		
	}

	@Override
	public boolean delete(Integer id) {
		if(id <= 0) {
		return false;
		}
		return dao.delete(id);
	}

	@Override
	public EmployeeInfo register(EmployeeInfo info) {
		if(dao.register(info)) {
		EmployeeInfo info1 = dao.getEmployee(info.getId());
		info.setPwd(null);
		return info1;
		}
		throw new EmployeeException("Data Already Exist");
	}
	
	@Override
	public boolean update(EmployeeInfo newData) {
		
		return dao.update(newData);
	}

	@Override
	public List<EmployeeInfo> getAllData(){
		return dao.getAllData();
	}
}

