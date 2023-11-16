package com.te.springjaxb.xmltest;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.te.springjaxb.beans.EmployeeInfo;
import com.te.springjaxb.beans.UserAddressBean;
import com.te.springjaxb.beans.UserOtherInfo;

public class XMLMarshallingTest2 {

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
		
		
		UserOtherInfo otherInfo = new UserOtherInfo();
		otherInfo.setAadhar(123456781231l);
		otherInfo.setGender("Female");
		
		bean.setOtherInfo(otherInfo);
		
		UserAddressBean addressBean = new UserAddressBean();
		addressBean.setAddressType('T');
		addressBean.setCity("Chennai");
		addressBean.setHouseNum(420);
		addressBean.setStreet("Ambal Nagar");
		
		UserAddressBean addressBean2 = new UserAddressBean();
		addressBean2.setAddressType('P');
		addressBean2.setCity("Chennai");
		addressBean2.setHouseNum(111);
		addressBean2.setStreet("MGR Nagar");
		
		ArrayList<UserAddressBean>addressBeans = new ArrayList();
		addressBeans.add(addressBean);
		addressBeans.add(addressBean2);
		
		bean.setAddressBeans(addressBeans);
		
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(EmployeeInfo.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(bean, System.out);
			marshaller.marshal(bean, new File("otherinfo.xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
