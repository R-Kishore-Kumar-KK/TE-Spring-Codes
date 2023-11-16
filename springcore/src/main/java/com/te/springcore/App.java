package com.te.springcore;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcore.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scn = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        
        Employee emp1 = context.getBean("emp", Employee.class);
        System.out.println("Enter the name of Employee One");
        emp1.setName(scn.nextLine());
        System.out.println("Enter the Id of Employee One");
        emp1.setId(Integer.parseInt(scn.nextLine()));
        System.out.println("Enter the Role of Employee One");
        emp1.setRole(scn.nextLine());
        
        System.out.println(emp1);
        
        Employee emp2 = context.getBean("emp", Employee.class);
        System.out.println("Enter the name of Employee Two");
        emp2.setName(scn.nextLine());
        System.out.println("Enter the Id of Employee Two");
        emp2.setId(Integer.parseInt(scn.nextLine()));
        System.out.println("Enter the Role of Employee Two");
        emp2.setRole(scn.nextLine());
        
        System.out.println(emp2);
        
        System.out.println(emp1);
    }
}
