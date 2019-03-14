package com.bank.dao;

import com.bank.bean.Customer;

public interface IDao {
	
	Customer register(Customer cust);
	Customer login(Customer cust);

}
