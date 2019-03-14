package com.bank.service;

import com.bank.bean.Customer;

public interface IService {
	
	Customer register(Customer cust);
	Customer login(Customer cust);

}
