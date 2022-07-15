package com.solid.open_closed;

/**
 * 
 * @author avinashshukla
 *
 */

//We will not modify the Subscriber class in future if some new type of subscriber comes
//We will just create a child class of subscriber if new Subscriber type comes.
//This is how we are open to extension but closed to modification

public abstract class Subscriber {
	
	private String name;
	private long phoneNo;
	private String address;
	private int amount;
	
	
	
	public Subscriber(String name, long phoneNo, String address, int amount) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
		this.amount = amount;
	}

	public abstract int calculateBill();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
