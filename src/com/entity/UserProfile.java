package com.entity;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

//@Entity
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class UserProfile {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY) 
	//@Extension(vendorName = "datanucleus", key = "gae.encoded-pk", value = "true")
	private Long userId;
	
	@Persistent
	private String email;
	
	@Persistent
	private String firstName, lastName, password, userType;
	
	
	/*
	@OneToMany
	@Persistent
	private ArrayList<BankAccount> bankAccounts;
	
	
	@OneToMany
	@Persistent
	private List<TransactionHistory> transactions;
	*/
	/*
	private int[] geoLocation;
	public UserProfile() {
		super();
	}
	
	public UserProfile(String firstName, String lastName, String email, String password, int[] geoLocation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.geoLocation = geoLocation;
	}
	
	public int[] getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(int[] geoLocation) {
		this.geoLocation = geoLocation;
	}
	*/
	
	/*
	public UserProfile(Long userId) {
		super();
		this.userId = userId;
	}
	
	public UserProfile(Long userId, String firstName, String lastName, String email, String password, String userType) {
		super();
		
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}
	
	public UserProfile(Long userId, String firstName, String lastName, String email, String password, String userType,
			List<BankAccount> bankAccounts, List<TransactionHistory> transactions) {
		super();
		
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userType = userType;
		this.bankAccounts = bankAccounts;
		this.transactions = transactions;
	}
	*/
	
	public Long getUserId() {
		return userId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	/*
	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	public List<TransactionHistory> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<TransactionHistory> transactions) {
		this.transactions = transactions;
	}
	*/
	
}
