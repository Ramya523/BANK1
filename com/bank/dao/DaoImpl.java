package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.bank.bean.Customer;
import com.bank.utility.Database;




public class DaoImpl implements IDao
{
	Scanner sc=new Scanner(System.in);
		Database db = new Database();
		Connection connection = db.getConnection();
		
		public Customer register(Customer cust) 
		{
			
			//Customer cust = new Customer();
			try
			{
				PreparedStatement ps = connection.prepareStatement("insert into customer_details (first_name , last_name, email_id,password, pancard_no , aadhaar_no ,address ,  mobile_no)"+ "values(?,?,?,?,?,?,?,?)");
				
				
				ps.setString(1, cust.getFirstname());
				ps.setString(2, cust.getLastname());
				ps.setString(3, cust.getEmailid());
				ps.setString(4, cust.getPassword());
				ps.setString(5, cust.getPancard());
				ps.setLong(6, cust.getAadhaarno());
				ps.setString(7, cust.getAddress());
				ps.setLong(8, cust.getMobileno());
				
				
				
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					
					cust.setFirstname(rs.getString(1));
					cust.setLastname(rs.getString(2));
					cust.setEmailid(rs.getString(3));
					cust.setPassword(rs.getString(4));
					cust.setPancard(rs.getString(5));
					
					cust.setAadhaarno(rs.getLong(6));
					cust.setAddress(rs.getString(7));
					cust.setMobileno(rs.getLong(8));
				
				}
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return cust;
	}
	



	public Customer login(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

}
