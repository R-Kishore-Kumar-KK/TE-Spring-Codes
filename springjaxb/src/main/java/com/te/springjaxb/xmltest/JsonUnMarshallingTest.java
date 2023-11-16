package com.te.springjaxb.xmltest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.te.springjaxb.beans.EmployeeInfo;

public class JsonUnMarshallingTest {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			EmployeeInfo bean = mapper.readValue(new File("user.json"), EmployeeInfo.class);
			System.out.println(bean.getBirthday());
			System.out.println(bean.getEmpId());
			System.out.println(bean.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
