package com.te.springjaxb.xmltest;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.te.springjaxb.beans.EmployeeInfo;

public class JsonMarshallingTest3 {

	public static void main(String[] args) {
		
		EmployeeInfo bean = new EmployeeInfo();
		bean.setEmpId(100);
		bean.setName("Kishore");
		bean.setMailId("kishore@gmail.com");
		bean.setLocation("Chennai");
		bean.setDesignation("Developer");
		bean.setMobile(7010975622l);
		bean.setPassword("kk123");
		bean.setSalary(45000.0);
		bean.setMarried(false);
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			mapper.writeValue(System.out, bean);
			mapper.writeValue(new File("user.json"), bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
