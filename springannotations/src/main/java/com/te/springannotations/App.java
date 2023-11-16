package com.te.springannotations;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springannotations.beans.Employee;
import com.te.springannotations.configuration.EmployeeConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        
        
//        Employee employeeBean = context.getBean(Employee.class);
//        Employee employeeBean = context.getBean("getEmpWithValues", Employee.class);
        Employee employeeBean = context.getBean("dc", Employee.class);
//        employeeBean.setId(100);
//        employeeBean.setName("Vivek");
//        System.out.println(employeeBean);
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the id of emp 1");
        employeeBean.setId(Integer.parseInt(scn.nextLine()));
        System.out.println("Enter the Name of emp 1");
        employeeBean.setName(scn.nextLine());
        
        System.out.println("Emp One"+ employeeBean);
        
        Employee employeeBeanTwo = context.getBean("dc", Employee.class);
        
        System.out.println("Enter the id of emp 2");
        employeeBeanTwo.setId(Integer.parseInt(scn.nextLine()));
        System.out.println("Enter the Name of emp 2");
        employeeBeanTwo.setName(scn.nextLine());
        
        System.out.println("Emp Two"+ employeeBeanTwo);
        
        System.out.println("--------------------------------");
        
        System.out.println("Emp One"+employeeBean);
        System.out.println("Emp Two"+ employeeBeanTwo);
    }
}
