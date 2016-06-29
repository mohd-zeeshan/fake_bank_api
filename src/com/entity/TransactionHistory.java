package com.entity;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

//@Entity
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TransactionHistory {
	
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long transactionId;
	
	@Persistent
	private Long userId;
	
	@Persistent
	private String withdrawal, deposit, balance; //amounts
	
	@Persistent
	private Date transactionDate = new Date();
	
	@Persistent
	private String transactionDescription;
	
	public Long getTransactionId() {
		return transactionId;
	}
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getWithdrawal() {
		return withdrawal;
	}
	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	/*public void setTransactionDate(Date date) {
		this.transactionDate = date;
	}*/
	public String getTransactionDescription() {
		return transactionDescription;
	}
	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}
}
