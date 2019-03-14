package com.bank.ui;

import java.util.Scanner;

import com.bank.bean.Customer;
import com.bank.service.IService;
import com.bank.service.ServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		
		Customer cust=new Customer();
		IService service=new ServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1) Registration\n2) Login\n3) Transaction\n4) Exit");
			int i=sc.nextInt();
			switch(i)
			{
				case 1:System.out.println("welcome to Registration page");
				       System.out.println("enter first name :");
				       sc.nextLine();
				       cust.setFirstname(sc.nextLine());
				       System.out.println("enter the last name :");
				       cust.setLastname(sc.nextLine());
				       System.out.println("enter email id :");
				       cust.setEmailid(sc.nextLine());
				       System.out.println("enter the password :");
				       cust.setPassword(sc.nextLine());
				       System.out.println("enter the pancard number :");
				       cust.setPancard(sc.nextLine());
				       System.out.println("enter the aadhar card number :");
				       cust.setAadhaarno(sc.nextLong());
				       System.out.println("enter the address :");
				       sc.nextLine();
				       cust.setAddress(sc.nextLine());
				       System.out.println("enter the mobile number:");
				       cust.setMobileno(sc.nextLong());
				       Customer c1=service.register(cust);
				       //System.out.println("Registered successfully"+ c1);
				       System.out.println("your account number is:"+ c1.getAccountno());
				       
				       
					break;
				case 2:System.out.println("log");
					break;
				case 3:System.out.println("trans");
					break;
				default:System.exit(0);
			}
		}

	}

}
