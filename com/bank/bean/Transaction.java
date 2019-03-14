package com.bank.bean;

public class Transaction {
	
	private int transactionid;
	private long fromaccountno;
	private long toaccountno;
	private double amounttransferred;
	public int getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}
	public long getFromaccountno() {
		return fromaccountno;
	}
	public void setFromaccountno(long fromaccountno) {
		this.fromaccountno = fromaccountno;
	}
	public long getToaccountno() {
		return toaccountno;
	}
	public void setToaccountno(long toaccountno) {
		this.toaccountno = toaccountno;
	}
	public double getAmounttransferred() {
		return amounttransferred;
	}
	public void setAmounttransferred(double amounttransferred) {
		this.amounttransferred = amounttransferred;
	}
	
	

}
