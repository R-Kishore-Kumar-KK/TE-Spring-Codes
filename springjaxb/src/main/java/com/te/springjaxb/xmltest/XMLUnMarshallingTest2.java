package com.te.springjaxb.xmltest;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.te.springjaxb.beans.EmployeeInfo;

public class XMLUnMarshallingTest2 {

	public static void main(String[] args) {
		
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(EmployeeInfo.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			EmployeeInfo bean = (EmployeeInfo) unmarshaller.unmarshal(new File("userinfo.xml"));
			System.out.println(bean.getName());
			System.out.println(bean.getAddressBeans().get(0).getAddressType());
			System.out.println(bean.getAddressBeans().get(0).getStreet());
			System.out.println(bean.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
