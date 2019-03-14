package com.bank.service;

import com.bank.bean.Customer;
import com.bank.dao.DaoImpl;
import com.bank.dao.IDao;
import com.bank.utility.InvalidAadharNoException;
import com.bank.utility.InvalidMobileNoException;

public class ServiceImpl implements IService {
	
	Customer cust=new Customer();
	public boolean validateMobileno(Customer cust)
	{
		
		
		
		if(cust.getMobileno()!=10)
		{
			return true;
		}
		return false;
		
	}
	
	public boolean validateAadhar(Customer cust)
	{
		if(cust.getAadhaarno()!=12)
		{
		return true;
		}
		return false;
		
	}

	public Customer register(Customer cust) {
		
		if(!(validateMobileno(cust)))
		{
			try {
				throw new InvalidMobileNoException();
			} catch (InvalidMobileNoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(!validateAadhar(cust))
		{
			try {
				throw new InvalidAadharNoException();
			} catch (InvalidAadharNoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		IDao dao=new DaoImpl();
		
		Customer c2=dao.register(cust);
		return c2;
	}

	public Customer login(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

}
