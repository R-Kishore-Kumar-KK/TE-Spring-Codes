package com.te.springjaxb.xmltest;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.te.springjaxb.beans.EmployeeInfo;

public class XMLMarshallingTest {

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
		
		JAXBContext context;
		
		try {
			context = JAXBContext.newInstance(EmployeeInfo.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(bean, System.out);
			marshaller.marshal(bean, new File("employeeinfo.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
