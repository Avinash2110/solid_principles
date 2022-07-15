package com.solid.open_closed;

/**
 * 
 * @author avinashshukla
 *
 */


//Class extending the Subscriber class to extend the feature for different subscribers
public class PhoneSubscriber extends Subscriber{
	
	

	public PhoneSubscriber(String name, long phoneNo, String address, int amount) {
		super(name, phoneNo, address, amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateBill() {
		// TODO Auto-generated method stub
		return this.getAmount() + 20;
	}
	
}
